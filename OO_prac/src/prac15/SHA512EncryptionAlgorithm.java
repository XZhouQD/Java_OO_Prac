package prac15;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA512EncryptionAlgorithm extends EncryptionAlgorithm{

	public SHA512EncryptionAlgorithm(String name) {
		super(name);
	}

	@Override
	public String encrypt(String input) {
		MessageDigest md;
		String hex = null;
		try {
			md = MessageDigest.getInstance("SHA-512");
			md.update(input.getBytes(StandardCharsets.UTF_8));
			byte[] digest = md.digest();
			hex = String.format("%064x", new BigInteger(1, digest));
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hex;
	}
	
}
