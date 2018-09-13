package gov.gsa.fas.AutoChoice.util;

import java.io.*;
import java.security.*;
import sun.misc.*;

public final class EncryptSHA1 {

	private static EncryptSHA1 encryptSHA1Ins;

	private EncryptSHA1() {
	}

	public synchronized String encrypt(String pwd) {
		//return pwd;
		//System.out.println(pwd);
		/***
		 * Enable this code after development complete
		 */ 
		MessageDigest messageDigest = null;
		try {
			messageDigest = MessageDigest.getInstance("SHA");
		} catch (NoSuchAlgorithmException e) {

		}
		try {
			//System.out.println(pwd.getBytes("UTF-8"));
			messageDigest.update(pwd.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
		}

		byte raw[] = messageDigest.digest();
		//System.out.println(raw);
		String hash = (new BASE64Encoder()).encode(raw);
		//System.out.println("Hash Password is " + hash);
		
		return hash;
		
	}

	public static synchronized EncryptSHA1 getInstance() {
		if (encryptSHA1Ins == null) {
			encryptSHA1Ins = new EncryptSHA1();
		}
		return encryptSHA1Ins;
	}
}
