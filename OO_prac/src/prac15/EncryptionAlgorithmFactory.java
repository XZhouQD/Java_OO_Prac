package prac15;

public class EncryptionAlgorithmFactory {
	private EncryptionAlgorithm sha256 = new SHA256EncryptionAlgorithm("SHA-256");
	private EncryptionAlgorithm sha512 = new SHA512EncryptionAlgorithm("SHA-512");
	private EncryptionAlgorithm md5 = new SHA512EncryptionAlgorithm("MD5");
	
	public EncryptionAlgorithmFactory() {
		super();
	}
	
	public EncryptionAlgorithm getAlgorithm(String name) {
		if (name == "SHA-256")
			return sha256;
		if (name == "SHA-512")
			return sha512;
		if (name == "MD5") {
			return md5;
		}
		return null;
	}
	
}
