package prac21;

public class XmlElement extends Element {

	private int id;
	
	public XmlElement(int id) {
		this.id = id;
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

	public int getId() {
		return id;
	}

}
