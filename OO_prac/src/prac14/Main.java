package prac14;

public class Main {

	public static void main(String[] args) {
		Publisher p1 = new Publisher();
		Subscriber s1 = new Subscriber();
		Subscriber s2 = new Subscriber();
		Subscriber s3 = new Subscriber();
		Subscriber s4 = new Subscriber();
		p1.addObserver(s1);
		p1.addObserver(s2);
		p1.addObserver(s3);
		p1.addObserver(s4);
		
		p1.sendTweet("Hello Java");
		
		p1.sendTweet("Good Morning");
	}

}
