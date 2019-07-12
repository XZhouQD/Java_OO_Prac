package prac10;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentArray {
	private Student[] students;
	public static final int MAX_SIZE = 10;
	private int count;
	
	public StudentArray() {
		students = new Student[MAX_SIZE];
		count = 0;
		addStudent("A", 1000000);
		addStudent("B", 2000000);
		addStudent("C", 3000000);
	}
	
	public void addStudent(String name, int zid) {
		Student s = new Student(zid, name);
		students[count] = s;
		count += 1;
	}

	public Student[] getStudents() {
		return students;
	}

	public int getCount() {
		return count;
	}
	
	public Iterator getIterator() {
		return new StudentArrayIterator(getStudents());
	}
	
}
