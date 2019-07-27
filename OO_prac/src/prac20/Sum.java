package prac20;

public class Sum {
	
	public Sum() {
	}

	public int sum(int x, int y) {
		return x+y;
	}
	
	public double sum(double x, double y) {
		return x+y;
	}
	
	public int sum(int x, int y, int z) {
		return x+y+z;
	}

	public static void main(String args[]) {
		Sum s = new Sum();
		System.out.println(s.sum(10, 20));
		System.out.println(s.sum(10.5, 20.5));
		System.out.println(s.sum(5, 10, 20));
	}
	
}
