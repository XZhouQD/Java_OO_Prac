package prac07;

public class NoStock implements MachineState {
	
	VendingMachine v;

	public NoStock(VendingMachine v) {
		this.v = v;
	}

	@Override
	public void insertCoin() {
		System.out.println("Invalid Behavor");
	}

	@Override
	public void deliverItem() {
		System.out.println("Invalid Behavor");
	}

	@Override
	public void returnCoin() {
		System.out.println("Invalid Behavor");
	}

}
