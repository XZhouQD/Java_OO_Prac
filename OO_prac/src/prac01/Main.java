package prac01;

public class Main {
	
	static int a1 = 5;
	static double b1 = 3.65;
	
	public static void main(String[] args) {
		
		printHello();
		
		System.out.println("Welcome to Java OO Practice!");
		
//		System.out.println("a = " + a1 + ", b = " + b1);
		
//		Variable vars = new Variable();
//		System.out.println("improted: "+ vars.a + ", " + vars.b + ", " + vars.c + ", " + vars.d);
		
//		Variable var1 = new Variable();
//		var1.e += 1;
//		var1.a += 1;
//		System.out.println("e = " + var1.e + ", a = " + var1.a);
//		Variable var2 = new Variable();
//		var2.e += 1;
//		var2.a += 1;
//		System.out.println("e = " + var2.e + ", a = " + var2.a);
		
		Variable var3 = new Variable(2, 1.35, 'f', 0.68);
		var3.setD(5.0);
		System.out.println("imported: " + var3.getA() +", "+ var3.getB() +", "+ var3.getC() + ", " + var3.getD());
	}
	
	public static void printHello () {
		System.out.println("Hello");
		System.out.println("a = " + a1 + ", b = " + b1);
	}
	
}
