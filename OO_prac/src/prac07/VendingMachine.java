package prac07;

public class VendingMachine {

	private int inventory;
	
	public VendingMachine() {
		this.inventory = 0;
	}

	public void addInventory(int amount) {
		this.inventory += amount;
	}
	
	public void insertCoin() {
		
	}
	
	public void returnCoin() {
		
	}
	
	public void deliverItem() {
		
	}
	
	public void noStock() {
		System.out.println("No Stock");
	}
}
