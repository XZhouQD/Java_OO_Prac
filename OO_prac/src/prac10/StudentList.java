package prac10;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentList {
	private ArrayList<Student> students;
	
	public StudentList() {
		students = new ArrayList<Student>();
		addStudent("A", 1000000);
		addStudent("B", 2000000);
		addStudent("C", 3000000);
	}
	
	public void addStudent(String name, int zid) {
		Student s = new Student(zid, name);
		students.add(s);
	}

	public ArrayList<Student> getStudents() {
		return students;
	}
	
	public Iterator getIterator() {
		return students.iterator();
	}
}
