package prac12;

import java.util.ArrayList;
import java.util.Iterator;

public class BookPack implements BookInterface {

	private ArrayList<BookInterface> bookPack;
	
	public BookPack() {
		bookPack = new ArrayList<BookInterface>();
	}

	@Override
	public void printBookName() {
		Iterator it = bookPack.iterator();
		while(it.hasNext()) {
			BookInterface b = (BookInterface) it.next();
			b.printBookName();
		}
	}
	
	public void addBook(BookInterface b) {
		bookPack.add(b);
	}
	
	public void removeBook(BookInterface b) {
		bookPack.remove(b);
	}

}
