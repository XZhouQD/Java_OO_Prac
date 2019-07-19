package prac16;

public class SHA256Encryptor implements Encryptor {

	private EncryptionAlgorithm sha256 = new SHA256EncryptionAlgorithm(); 
	
	@Override
	public void writeToDisk(String input, String filename) {
		// TODO Auto-generated method stub

	}

	@Override
	public EncryptionAlgorithm getEncryptionAlgorithm() {
		return this.sha256;
	}

}
