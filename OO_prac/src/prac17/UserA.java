package prac17;

public class UserA {
	private String firstName; //required
	private String lastName; //required
	private int age; //optional
	private int[] phone; //optional
	private String address; //optional
	
	public UserA(String firstName, String lastName) {
		this(firstName, lastName, 0);
	}
	
	public UserA(String firstName, String lastName, int age) {
		this(firstName, lastName, age, new int[9]);
	}
	
	public UserA(String firstName, String lastName, int[] phone) {
		this(firstName, lastName, 0, phone);
	}
	
	public UserA(String firstName, String lastName, String address) {
		this(firstName, lastName, 0, new int[9], address);
	}
	
	public UserA(String firstName, String lastName, int age, int[] phone) {
		this(firstName, lastName, age, phone, "");
	}
	
	
	public UserA(String firstName, String lastName, int age, int[] phone, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}
	
	
}
