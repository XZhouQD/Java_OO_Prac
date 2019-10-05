package prac05_01;

public class ReadOnlyObject implements Readable {

	private String text;
	
	public ReadOnlyObject(String text) {
		this.text = text;
	}

	@Override
	public String read() {
		return this.text;
	}

}
