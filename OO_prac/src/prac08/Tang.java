package prac08;

public class Tang extends Beverage {

	public Tang() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void brew() {
		System.out.println("Brew Tang");
	}

	@Override
	public void addCondiment() {
		System.out.println("No Condiment Added");
	}

}
