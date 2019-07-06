package prac08;

public class Coffee extends Beverage{

	public Coffee() {
	}
	

	@Override
	public void brew() {
		System.out.println("Brew Coffee");
	}

	@Override
	public void addCondiment() {
		System.out.println("Add Sugar & Milk");
	}

}
