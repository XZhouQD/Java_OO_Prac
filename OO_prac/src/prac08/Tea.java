package prac08;

public class Tea extends Beverage{

	public Tea() {
	}

	@Override
	public void brew() {
		System.out.println("Sweep Tea");
	}

	@Override
	public void addCondiment() {
		System.out.println("Add Lemon");
	}

	
}
