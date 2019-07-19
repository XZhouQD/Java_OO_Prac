package prac13;

public class HamSandwich implements Sandwich {

	private String customerName;
	private Sandwich original;
	
	public HamSandwich(Sandwich s) {
		this.original = s;
		this.customerName = s.getCustomerName();
	}

	@Override
	public String getDescription() {
		return "Ham " + original.getDescription();
	}

	@Override
	public double getCost() {
		return 1.0 + original.getCost();
	}

	@Override
	public String getCustomerName() {
		return customerName;
	}

}
