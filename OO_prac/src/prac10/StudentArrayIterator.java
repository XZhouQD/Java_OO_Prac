package prac10;

import java.util.Iterator;

public class StudentArrayIterator implements Iterator<Student> {

	private Student[] students;
	private int position = 0;
	
	public StudentArrayIterator(Student[] ss ) {
		this.students = ss;
	}
	
	@Override
	public boolean hasNext() {
		if (position >= students.length || students[position] == null) {
			return false;
		}
		return true;
	}

	@Override
	public Student next() {
		Student s = students[position];
		position += 1;
		return s;
	}

}
