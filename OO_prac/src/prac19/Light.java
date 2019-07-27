package prac19;

public class Light {

	private boolean on;
	
	public Light() {
		this.on = false;
	}
	
	public void switchOn() {
		this.on = true;
	}
	
	public void switchOff() {
		this.on = false;
	}

	public void printStatus() {
		System.out.println("Light is " + this.on);
	}
	
}
