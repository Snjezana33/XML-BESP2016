package app;

import encryption.Decrypt;
import encryption.Encrypt;
import gui.main.form.MainFrame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import signature.SignEnveloped;
import signature.VerifySignatureEnveloped;
import vezbe.bsep.bcrypt.BCrypt;
import vezbe.bsep.bcrypt.BCryptHashing;
import vezbe.bsep.passwords.PasswordStorage;

public class Aplication {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws InvalidKeySpecException 
	 * @throws NoSuchAlgorithmException 
	 */
	public static void main(String[] args) throws IOException, NoSuchAlgorithmException, InvalidKeySpecException {
		// TODO Auto-generated method stub
		
		MainFrame.getInstance().setVisible(true);

		
		Encrypt encrypt = new Encrypt();
		encrypt.testIt();
		
		Decrypt decrypt = new Decrypt();
		decrypt.testIt();
		
		SignEnveloped sign = new SignEnveloped();
		sign.testIt();
		
		VerifySignatureEnveloped verify = new VerifySignatureEnveloped();
		verify.testIt();
		BCryptHashing bcrypthsh= new BCryptHashing();
		System.out.println("Hesiramo lozinku sa saltom.");
		String hashed = BCrypt.hashpw("test", BCrypt.gensalt());//10
		System.out.println("Hesirana lozinka: " + hashed );
		System.out.println("Hesiramo lozinku sa saltom i tezinom 12.");
		String hashed1 = BCrypt.hashpw("test", BCrypt.gensalt(12));
		System.out.println("Hesirana lozinka: " + hashed1 );
		
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Password:");
		String attemptedPassword = in.readLine();
		if (BCrypt.checkpw(attemptedPassword, hashed))
			System.out.println("ACCESS GRANTED");
		else
			System.out.println("ACCESS DENIED!!!");
		PasswordStorage pswst=new PasswordStorage();
		 // umesto citanja passwora iz baze recimo, ovde imamo hardkodirani password
		 // naravno, iz baze bi se citao vec hashirani 
		String password = "toomanysecrets";
		// i prethodno generisani salt bi bio snimljen u bazu ...
		byte[] salt = pswst.generateSalt();
		// cisto da bi videli kako izgleda ...
		System.out.println("Salt is: " + pswst.base64Encode(salt));
		byte[] hashedPassword = pswst.hashPassword(password, salt);
		System.out.println("Hashed password is: " + pswst.base64Encode(hashedPassword));
		// hashedPassword sluzi kao snimljena lozinka u bazi recimo ...
		// naravno cuva se i salt koji ne mora biti nikako zasticen jer se ne smatra tajnim podatkom
		BufferedReader in1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Password:");
		String attemptedPassword1 = in1.readLine();
		
		if(pswst.authenticate(attemptedPassword1, hashedPassword, salt)){
			System.out.println("ACCESS GRANTED");
		}else{
			System.out.println("ACCESS DENIED");
			
		}
		
	}

}
