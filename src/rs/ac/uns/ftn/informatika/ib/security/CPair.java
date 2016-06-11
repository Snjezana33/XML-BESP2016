package rs.ac.uns.ftn.informatika.ib.security;



import java.security.cert.X509Certificate;

import org.bouncycastle.cert.X509CRLHolder;

public class CPair {
	
	private X509Certificate certificate;
	private X509CRLHolder crl;

	public X509Certificate getCertificate() {
		return certificate;
	}
	public void setCertificate(X509Certificate certificate) {
		this.certificate = certificate;
	}
	public X509CRLHolder getCrl() {
		return crl;
	}
	public void setCrl(X509CRLHolder crl) {
		this.crl = crl;
	}
	
	

}
