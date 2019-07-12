package prac12;

public class Main {

	public static void main(String[] args) {
		Book b1 = new Book("A");
		Book b2 = new Book("B");
		BookPack bp1 = new BookPack();
		bp1.addBook(b1);
		bp1.addBook(b2);
		Book b3 = new Book("C");
		Book b4 = new Book("D");
		BookPack bp2 = new BookPack();
		bp2.addBook(b3);
		bp2.addBook(b4);
		bp1.addBook(bp2);
		
		bp1.printBookName();
	}

}
