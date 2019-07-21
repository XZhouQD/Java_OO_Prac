package prac17;

public class Main {

	public static void main(String[] args) {
		User u1 = new User.UserBuilder("Lapis", "Lazuli")
				.age(21)
				.phone("556677889")
				.address("Java Prac Address")
				.build();
		System.out.println(u1.getFirstName() + " " + u1.getLastName() + " " + u1.getAge() + " " + u1.getPhone() + " " + u1.getAddress());
	}

}
