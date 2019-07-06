package prac07;

public class Pending implements MachineState {

	VendingMachine v;
	
	public Pending(VendingMachine v) {
		this.v = v;
	}

	@Override
	public void insertCoin() {
		System.out.println("Coin inserted");
		v.changeCoinInserted();
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
