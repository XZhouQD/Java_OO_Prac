package prac08;

public abstract class Beverage {

	public Beverage() {
	}
	
	final public void makeBeverage() {
		boilWater();
		brew();
		pourInCup();
		addCondiment();
	}
	
	private void boilWater() {
		System.out.println("Boil Water");
	}
	
	private void pourInCup() {
		System.out.println("Pour beverage in cup");
	}
	
	abstract public void brew();
	
	abstract public void addCondiment();

}
