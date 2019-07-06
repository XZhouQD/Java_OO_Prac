package prac06_1;

public class Cat extends Animal{

	public Cat(String name, double weight, double height, double length) {
		super(name, weight, height, length);
		super.setSound(new Meow());
	}

	@Override
	public void makeSound() {
		System.out.println("Meow");
	}
	
}
