package prac07;

public class VendingMachine {

	private int inventory;
	private MachineState state;
	
	private MachineState noStock = new NoStock(this);
	private MachineState pending = new Pending(this);
	private MachineState coinInserted = new CoinInserted(this);
	
	public VendingMachine() {
		this.inventory = 0;
		this.state = noStock;
	}

	public void addInventory(int amount) {
		this.inventory += amount;
		changePending();
	}
	
	public void changeCoinInserted() {
		this.state = coinInserted;
	}
	
	public void changePending() {
		this.state = pending;
	}
	
	public void changeNoStock() {
		this.state = noStock;
	}
	
	public void insertCoin() {
		state.insertCoin();
	}
	
	public void returnCoin() {
		state.returnCoin();
	}
	
	public void deliverItem() {
		state.deliverItem();
	}
	
	public void noStock() {
		System.out.println("No Stock");
	}

	public int getInventory() {
		return inventory;
	}
	
	public void sellItem() {
		this.inventory -= 1;
	}
	
	
}
