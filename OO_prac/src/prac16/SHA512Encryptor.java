package prac16;

public class SHA512Encryptor implements Encryptor {

	private EncryptionAlgorithm sha512 = new SHA512EncryptionAlgorithm();
	
	@Override
	public void writeToDisk(String input, String filename) {
		// TODO Auto-generated method stub

	}

	@Override
	public EncryptionAlgorithm getEncryptionAlgorithm() {
		return this.sha512;
	}

}
