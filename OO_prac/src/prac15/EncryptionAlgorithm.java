package prac15;

public abstract class EncryptionAlgorithm {
	private String name;
	
	public EncryptionAlgorithm(String name) {
		super();
		this.name = name;
	}
	
	public abstract String encrypt(String input);
	
}
