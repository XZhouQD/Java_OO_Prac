package prac02;

public class Main {

	public static void main(String[] args) {
		Course math1131 = new Course("MATH1131", "Mathmetics 1A", "Introduction to Mathmetics");
		Course comp2511 = new CompCourse("COMP2511", "Object-Oriented Design & Programming", "Theory and practice of O-O design and programming", 375.00);
		System.out.println(math1131.toString());
		System.out.println(comp2511.toString());
		
		((CompCourse) comp2511).printQuota();
	}
	
}
