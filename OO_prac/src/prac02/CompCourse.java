package prac02;

public class CompCourse extends Course {

	private double diskQuota;
	
	public CompCourse(String courseCode, String title, String description, double diskQuota) {
		super(courseCode, title, description);
		this.diskQuota = diskQuota;
	}

	public double getDiskQuota() {
		return diskQuota;
	}

	@Override
	public String toString() {
		return super.toString() + ", added CSE Disk Quota: " + getDiskQuota() + "MB";
	}
	
	public void printQuota() {
		System.out.println(diskQuota);
	}
	
}
