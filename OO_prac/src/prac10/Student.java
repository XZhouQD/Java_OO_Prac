package prac10;

public class Student {
	
	private int zid;
	private String Name;
	
	public Student(int zid, String name) {
		this.zid = zid;
		Name = name;
	}
	
	public int getZid() {
		return zid;
	}
	
	public String getName() {
		return Name;
	}
}
