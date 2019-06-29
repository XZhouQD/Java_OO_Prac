package prac05;

public class Normal extends Base {

	public Normal(int baseId, boolean isFix, String desc) {
		super(baseId, isFix, desc);
	}

	@Override
	public String toString() {
		return super.toString() + "/Normal";
	}
	
	@Override
	public String fatalComment() {
		return "This is not fatal bug.";
	}

}
