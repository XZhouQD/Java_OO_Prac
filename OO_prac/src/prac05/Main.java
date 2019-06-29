package prac05;

public class Main {


	public Main() {
	}

	public static void main(String[] args) {
		//Base bug1 = new Base(1, false, "Base Bug");
		Base bug2 = new Normal(2, true, "Fixed normal bug");
		Base bug3 = new Fatal(3, false, "Unfixed fatal bug", "It is unhealthy");
		
		System.out.println(bug2.toString());
		System.out.println(bug3.toString());
		System.out.println(bug2.fatalComment());
		System.out.println(bug3.fatalComment());
	}

}
