package prac16;

public interface Encryptor {
	public void writeToDisk(String input, String filename);
	public EncryptionAlgorithm getEncryptionAlgorithm();
}
