package prac07;

public class CoinInserted implements MachineState {

	VendingMachine v;
	
	public CoinInserted(VendingMachine v) {
		this.v = v;
	}

	@Override
	public void insertCoin() {
		System.out.println("Invalid Behavor");
	}

	@Override
	public void deliverItem() {
		System.out.println("Item Delivering");
		v.sellItem();
		if(v.getInventory() == 0)
			v.changeNoStock();
		else
			v.changePending();
	}

	@Override
	public void returnCoin() {
		System.out.println("Coin returning");
		v.changePending();
	}

}
