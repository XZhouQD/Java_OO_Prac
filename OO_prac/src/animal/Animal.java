package animal;

public class Animal {

	private String name;
	private String type;
	private double height;
	private double weight;
	private String catSound;
	private String dogSound;
	private String snakeSound;

	
	public Animal(String name, String type, double height, double weight, String catSound, String dogSound, String snakeSound) {
		super();
		this.name = name;
		this.type = type;
		this.height = height;
		this.weight = weight;
		this.catSound = catSound;
		this.dogSound = dogSound;
		this.snakeSound = snakeSound;
	}



	public String makeSound() {
		if(name.equals("cat")) {
			return catSound;
		} else if(name.equals("dog")) {
			return dogSound;
		} else if (name.equals("snake")) {
			return snakeSound;
		}
		return null;
	}
}
