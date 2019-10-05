package prac05_01;

public class RWObject implements Readable, Writable {

	private String text;
	
	public RWObject(String text) {
		this.text = text;
	}

	@Override
	public void write(String s) {
		this.text = s;
	}

	@Override
	public String read() {
		return this.text;
	}

}
