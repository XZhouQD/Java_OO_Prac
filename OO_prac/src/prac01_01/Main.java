package prac01_01;

import prac01.Variable;

public class Main {

	public static void main(String[] args) {
		Variable var3 = new Variable(2/*, 1.35, 'f', 0.68*/);
		var3.setD(5.0);
		System.out.println("imported: " + var3.a +", "+ var3.b +", "+ var3.c + ", " + var3.getD());
	}

}
