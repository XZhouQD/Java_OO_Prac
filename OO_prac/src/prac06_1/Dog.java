package prac06_1;

public class Dog extends Animal{

	public Dog(String name, double weight, double height, double length) {
		super(name, weight, height, length);
		super.setSound(new Bark());
	}

	@Override
	public void makeSound() {
		System.out.println("Barking");
	}
	
}
