package prac01;

public class Variable {
//	public int a = 5;
//	protected double b = 3.65;
//	char c = 'c';
//	double d = 1.3;
//	public static int e = 0;
//	public final int f = 2;
//	
//	public Variable() {
//		// Empty Constructor
//	}
	
	private int a;
	private double b;
	private char c;
	private double d;
	
	public Variable(int a, double b, char c, double d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public char getC() {
		return c;
	}

	public void setC(char c) {
		this.c = c;
	}

	public double getD() {
		return d;
	}

	public void setD(double d) {
		this.d = d;
	}
	
	
}
