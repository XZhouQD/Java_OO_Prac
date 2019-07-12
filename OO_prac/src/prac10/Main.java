package prac10;

import java.util.ArrayList;
import java.util.Iterator;

import prac11.Name;

public class Main {

//	public static void main(String[] args) {
//		StudentList studentList = new StudentList();
//		StudentArray studentArray = new StudentArray();
//		
//		ArrayList<Student> a = studentList.getStudents();
//		Student[] b = studentArray.getStudents();
//		
//		System.out.println("Student List:");
//		for (int i = 0; i < a.size(); i++) {
//			Student s = a.get(i);
//			System.out.println(s.getZid() + " " + s.getName());
//		}
//		
//		System.out.println("Student Array:");
//		for (int i = 0; i < studentArray.getCount(); i++) {
//			Student s = b[i];
//			System.out.println(s.getZid() + " " + s.getName());
//		}
//	}
	
	public static void main(String[] args) {
		StudentList studentList = new StudentList();
		StudentArray studentArray = new StudentArray();
		
		System.out.println("Student List:");
		print(studentList.getIterator());
		
		System.out.println("Student Array:");
		print(studentArray.getIterator());
		
		Student debug = new Student(0, "") {
			@Override
			public String getName() {
				return "This is Debug Student";
			}
		};
		System.out.println(debug.getName());
	}
	
	private static void print(Iterator i) {
		while (i.hasNext()) {
			Student s = (Student) i.next();
			System.out.println(s.getZid() + " " + s.getName());
		}
	}
}
