package prac14;

import java.util.Observable;

public class Publisher extends Observable {
	private String tweet;

	public Publisher() {
		super();
	}

	public void sendTweet(String tweet) {
		this.tweet = tweet;
		setChanged();
		notifyObservers(tweet);
	}
}
