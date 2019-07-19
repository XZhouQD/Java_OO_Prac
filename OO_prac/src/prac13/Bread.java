package prac13;

public class Bread implements Sandwich{

	private String customerName;
	
	public Bread(String customerName) {
		super();
		this.customerName = customerName;
	}
	
	@Override
	public String getDescription() {
		return "Sandwich";
	}

	@Override
	public double getCost() {
		return 1.0;
	}

	@Override
	public String getCustomerName() {
		return customerName;
	}
	
}
