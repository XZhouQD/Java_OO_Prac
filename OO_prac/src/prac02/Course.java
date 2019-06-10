package prac02;

public class Course {
	private String courseCode;
	private String title;
	private String description;
	public Course(String courseCode, String title, String description) {
		super();
		this.courseCode = courseCode;
		this.title = title;
		this.description = description;
	}
	
	public String getCourseCode() {
		return courseCode;
	}
	public String getTitle() {
		return title;
	}
	public String getDescription() {
		return description;
	}

	public String toString() {
		return getCourseCode() + ":" + getTitle();
	}

}
