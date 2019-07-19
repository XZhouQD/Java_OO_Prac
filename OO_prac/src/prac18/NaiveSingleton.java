package prac18;

public final class NaiveSingleton {
	private static NaiveSingleton instance;
	private String Name;
	private String Location;
	
	private NaiveSingleton() {
		this.Name = "LapisLazuli";
		this.Location = "Minecraft";
	}
	
	public static NaiveSingleton getInstance() {
		if (instance == null)
			instance = new NaiveSingleton();
		return instance;
	}
}
