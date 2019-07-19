package prac13;

public class TomatoSandwich implements Sandwich {

	private String customerName;
	private Sandwich original;
	
	public TomatoSandwich(Sandwich s) {
		this.original = s;
		this.customerName = s.getCustomerName();
	}
	
	@Override
	public String getDescription() {
		return "Tomato " + original.getDescription();
	}

	@Override
	public double getCost() {
		return 0.5 + original.getCost();
	}

	@Override
	public String getCustomerName() {
		return customerName;
	}

}
