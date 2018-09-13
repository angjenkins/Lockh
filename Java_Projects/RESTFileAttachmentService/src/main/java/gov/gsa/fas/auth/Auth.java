package gov.gsa.fas.auth;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import org.apache.commons.codec.binary.Base64;

public class Auth {
	/*public static void main(String[] args) throws NoSuchAlgorithmException {
		byte[] gensalt = generateSalt();
		System.out.println("generated byte string = " + gensalt);
		String gensaltstring = bytetoString(gensalt);
		System.out.println("generated password string = " + gensaltstring);
		byte[] b = new byte[]{'e','s','o','a'};
		byte[] genhashsalt = getHashWithSalt(gensaltstring, b);
		String genhashsaltstring = bytetoString(genhashsalt);
		System.out.println(genhashsaltstring);
		String gensaltstring = "92mnGg1Cb14D9hVhG1W5fZra4UI=";
		byte[] b = new byte[]{'e','s','o','a'};
		byte[] genhashsalt = getHashWithSalt(gensaltstring, b);
		String genhashsaltstring = bytetoString(genhashsalt);
		System.out.println(genhashsaltstring);
		
	}*/

	public static byte[] generateSalt() {
		SecureRandom random = new SecureRandom();
		byte bytes[] = new byte[20];
		random.nextBytes(bytes);
		return bytes;
	}

	public static String bytetoString(byte[] input) {
		return org.apache.commons.codec.binary.Base64.encodeBase64String(input);
	}

	public static byte[] getHashWithSalt(String input, byte[] salt)
			throws NoSuchAlgorithmException {
		MessageDigest digest = MessageDigest.getInstance("SHA-1");
		digest.reset();
		digest.update(salt);
		byte[] hashedBytes = digest.digest(stringToByte(input));
		return hashedBytes;
	}

	public static byte[] stringToByte(String input) {
		if (Base64.isBase64(input)) {
			return Base64.decodeBase64(input);
		} else {
			return Base64.encodeBase64(input.getBytes());
		}
	}

}