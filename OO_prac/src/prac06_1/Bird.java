package prac06_1;

public class Bird extends Animal {

	public Bird(String name, double weight, double height, double length) {
		super(name, weight, height, length);
		super.setSound(new Sing());
	}

	@Override
	public void makeSound() {
		System.out.println("Singing");
	}

}
