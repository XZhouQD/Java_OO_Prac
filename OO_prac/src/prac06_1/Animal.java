package prac06_1;

public class Animal {

	private String name;
	private double weight;
	private double height;
	private double length;
	
	private Sound sound;
	
	public Animal(String name, double weight, double height, double length) {
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.length = length;
	}
	
	
	public void setSound(Sound sound) {
		this.sound = sound;
	}

	public void makeSound() {
		sound.makeSound();
	}
	

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public String getName() {
		return name;
	}

	
	
}
