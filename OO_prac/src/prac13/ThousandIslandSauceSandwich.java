package prac13;

public class ThousandIslandSauceSandwich implements Sandwich {

	private String customerName;
	private Sandwich original;
	
	public ThousandIslandSauceSandwich(Sandwich s) {
		this.original = s;
		this.customerName = s.getCustomerName();
	}
	
	@Override
	public String getDescription() {
		return original.getDescription() + " with thousand islands sauce";
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
