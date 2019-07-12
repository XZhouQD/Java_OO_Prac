package prac09;

import java.util.stream.IntStream;

public class Exceptions {

	static int[] l = new int[2];
	
	public static void main(String[] args) {
		l[0] = 5;
		l[1] = 20;
		methodA();
	}
	
	public static void methodA() {
		System.out.println("Enter Method A");
		methodB();
		System.out.println("Leave Method A");
	}
	
	public static void methodB() {
		System.out.println("Enter Method B");
		methodC();
		System.out.println("Leave Method B");
	}
	
	public static void methodC() {
		System.out.println("Enter Method C");
//		try {
			methodD();
//		} catch (MaxNumberException e) {
//			e.printStackTrace();
//		}
		System.out.println("Leave Method C");
	}
	
	public static void methodD() /*throws MaxNumberException*/ {
		System.out.println("Enter Method D");
		for (int i : l) {
//			if (i > 5) throw new MaxNumberException("Number input cannot be larger than 5, you got " + i);
			System.out.println("Number " + i);
		}
//		IntStream.range(0, 3).forEachOrdered(i -> {
//			System.out.println("Number " + l[i]);
//		});
		System.out.println("Leave Method D");
	}

}
