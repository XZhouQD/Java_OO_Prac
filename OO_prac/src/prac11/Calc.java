package prac11;

public class Calc {
	private boolean help = false;
	
	private Cheat c = new Cheat();
	
	private class Cheat {
		public void cheatTable() {
			help = true;
		}
	}
	
	public void activate() {
		c.cheatTable();
	}
}
