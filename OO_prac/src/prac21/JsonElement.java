package prac21;

public class JsonElement extends Element {

	private int id;
	
	public JsonElement(int id) {
		this.id = id;
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
	
	public int getID() {
		return this.id;
	}

}
