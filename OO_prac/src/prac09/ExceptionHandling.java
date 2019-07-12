package prac09;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandling {
	
	private static FileReader fr;

	public static void main(String[] args) {
		
		try {
			fr = createReader(new File("file.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}
		try {
			fr.close();
		} catch (NullPointerException e) {
			System.out.println("null pointer");
		} catch (IOException e) {
			System.out.println("I/O error");
		}
		System.out.println("Program end");
	}
	
	public static FileReader createReader(File source) throws FileNotFoundException{
		File f = source;
		FileReader fr = new FileReader(f);
		return fr;
	}

}
