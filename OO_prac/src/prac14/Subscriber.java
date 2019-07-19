package prac14;

import java.util.Observable;
import java.util.Observer;

public class Subscriber implements Observer {

	private String latest;
	
	
	
	public Subscriber() {
		super();
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		this.setLatest((String) arg1);
		printLatest();
	}

	public String getLatest() {
		return latest;
	}

	public void setLatest(String latest) {
		this.latest = latest;
	}
	
	public void printLatest() {
		System.out.println(this.latest);
	}

}
