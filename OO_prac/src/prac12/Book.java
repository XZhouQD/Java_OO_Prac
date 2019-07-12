package prac12;

public class Book implements BookInterface {

	private String name;
	
	public Book(String name) {
		super();
		this.name = name;
	}

	@Override
	public void printBookName() {
		System.out.println(name);
	}

}
