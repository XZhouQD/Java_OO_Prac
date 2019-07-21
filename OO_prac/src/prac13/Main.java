package prac13;

public class Main {

	public static void main(String[] args) {
		Sandwich s = new Bread("Lapis");
		s = new EggSandwich(s);
		s = new HamSandwich(s);
		s = new TomatoSandwich(s);
		System.out.println(s.getDescription() + ", price = " + s.getCost());
	}

}
