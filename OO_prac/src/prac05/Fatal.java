package prac05;

public class Fatal extends Base {
	
	String fatalInfo;

	public Fatal(int baseId, boolean isFix, String desc, String fatalInfo) {
		super(baseId, isFix, desc);
		this.fatalInfo = fatalInfo;
	}

	@Override
	public String fatalComment() {
		return "Fatal Bug:" + fatalInfo;
	}

}
