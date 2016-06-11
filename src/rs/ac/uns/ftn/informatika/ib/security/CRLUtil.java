package rs.ac.uns.ftn.informatika.ib.security;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Security;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.bouncycastle.asn1.DEREnumerated;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.CRLNumber;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.X509Extension;
import org.bouncycastle.cert.CertIOException;
import org.bouncycastle.cert.X509CRLEntryHolder;
import org.bouncycastle.cert.X509CRLHolder;
import org.bouncycastle.cert.X509v2CRLBuilder;
import org.bouncycastle.cert.jcajce.JcaX509ExtensionUtils;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.operator.ContentSigner;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.jcajce.JcaContentSignerBuilder;
import org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder;
import org.bouncycastle.x509.extension.X509ExtensionUtil;

public class CRLUtil {

	public void generateCRL(KeyStore ks, String commonName) {
		Certificate cert = null;
		try {
			cert = ks.getCertificate(commonName);
			X509Certificate certificate = (X509Certificate) cert;

			final java.util.Calendar cal = GregorianCalendar.getInstance();
			X500Name name = new X500Name(certificate.getSubjectX500Principal()
					.getName());
			System.out.println("name: " + name);

			X509v2CRLBuilder crlGen = new X509v2CRLBuilder(name, cal.getTime());

			cal.roll(Calendar.YEAR, 1);
			crlGen.setNextUpdate(cal.getTime());

			PrivateKey pk = (PrivateKey) ks.getKey(commonName,
					commonName.toCharArray());
			crlGen.addExtension(X509Extension.cRLNumber, false, new CRLNumber(
					BigInteger.ONE));// Because we create it. The CRLNumber is 1
			ContentSigner contentSigner = new JcaContentSignerBuilder(
					"SHA1withRSA").setProvider("BC").build(pk);// sign with our
																// privatekey
			X509CRLHolder crlholder = crlGen.build(contentSigner);
			//TODO ovo mi je malo bzvz
			if (commonName.equals("centralnabanka")) {
				writeCRLToFile(new File("./rootCA/" + commonName + ".crl"),
						crlholder);
			} else {
				writeCRLToFile(new File("./certificates/" + commonName + ".crl"),
						crlholder);
			}

		} catch (KeyStoreException e) {
			e.printStackTrace();
		} catch (UnrecoverableKeyException e) {
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (CertIOException e) {
			e.printStackTrace();
		} catch (OperatorCreationException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Apdejtuje CRL listu
	 * @param crl CRL lista koja se apdejtuje
	 * @param pub Sertifikat koji se ukida
	 * @param priv Privatni ključ da potpišem listu
	 * @return nova lista
	 */
	public X509CRLHolder updateCRL(X509CRLHolder crl,
			X509Certificate pub, PrivateKey priv) {
		Security.addProvider(new BouncyCastleProvider());
		try {
			Date now = new Date();
			X509v2CRLBuilder crlGen = new X509v2CRLBuilder(crl.getIssuer(), now); // Create
																					// the
																					// builder
			Date nextUpdate = new Date(now.getTime() + 30 * 24 * 60 * 60 * 1000);

			crlGen.addCRL(crl); // add the existing one into it
			
			BigInteger serial = pub.getSerialNumber();
			System.out.println(serial);
			crlGen.addCRLEntry(serial, now, 0); // Add the serial to revoke
			//reason set to 0: unspecified (da bude lakse)
			
			crlGen.setNextUpdate(nextUpdate);

			Extension ex = crl.getExtension(X509Extension.cRLNumber);
			BigInteger newnumber = new BigInteger(ex.getParsedValue()
					.toString()).add(BigInteger.ONE); // apdejtujem broj crl liste
			System.out.println("apdejtovan br liste: " + newnumber);

			crlGen.addExtension(X509Extension.authorityKeyIdentifier, false,
					new JcaX509ExtensionUtils()
							.createAuthorityKeyIdentifier(pub));
			crlGen.addExtension(X509Extension.cRLNumber, false, new CRLNumber(
					newnumber));
			

			ContentSigner contentSigner = new JcaContentSignerBuilder(
					"SHA1withRSA").setProvider("BC").build(priv);
			X509CRLHolder crlholder = crlGen.build(contentSigner);
		

			return crlholder;
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * Da li je validna crl lista
	 * @param crl Lista koja se proverava
	 * @param caCert Sertifikat na koji se ona odnosi
	 * @return
	 */
	public static boolean isCRLValid(X509CRLHolder crl, X509Certificate caCert) {
		try {
			return crl.isSignatureValid(new JcaContentVerifierProviderBuilder()
					.setProvider("BC").build(caCert));
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public static boolean serialNotInCRL(X509CRLHolder crl, BigInteger serial) {
		X509CRLEntryHolder entry = crl.getRevokedCertificate(serial);
		if (entry == null) {
			return true;
		}
		else {
			System.out.println("Detalji ukidanja:");
			System.out.println("Broj sertifikata: " + entry.getSerialNumber());
			System.out.println("Issuer            : " + crl.getIssuer());
			if (entry.hasExtensions()) {
				Extension ext = entry.getExtension(X509Extension.reasonCode);
				if (ext != null) {
					DEREnumerated reasonCode;
					try {
						reasonCode = (DEREnumerated)X509ExtensionUtil.fromExtensionValue(ext.getExtnValue().getEncoded());
						System.out.println("Reason Code      : "+reasonCode.getValue());
					} catch (IOException e) {e.printStackTrace();	}
		        }
			}
			return false;
		}
	}

	/**
	 * Čuva crl listu u fajl
	 * @param file
	 * @param crl
	 * @return
	 */
	public boolean writeCRLToFile(File file, X509CRLHolder crl) {
		try {
			FileOutputStream fos = new FileOutputStream(file);
			fos.write(crl.getEncoded());
			fos.flush();
			fos.close();
			return true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public X509CRLHolder loadCRLFromFile(File file) {
		FileInputStream in;
		X509CRLHolder crlholder = null;
		try {
			in = new FileInputStream(file);
			crlholder = new X509CRLHolder(in);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return crlholder;
	}
	
	
}
