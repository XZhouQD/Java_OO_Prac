package prac05;

public abstract class Base {

	private int baseId;
	private boolean isFix;
	private String desc;
	
	public Base(int baseId, boolean isFix, String desc) {
		this.baseId = baseId;
		this.isFix = isFix;
		this.desc = desc;
	}

	public String toString() {
		return "ID: " + this.baseId + "/ fixed: " + this.isFix + "/ desc: " + this.desc;
	}
	
	public abstract String fatalComment();

}
