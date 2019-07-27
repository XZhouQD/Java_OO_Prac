package prac21;

public class VisitorMain {

	public VisitorMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Visitor v = new ElementVisitor();
		
		Document d = new Document();
		d.addElement(new JsonElement(3));
		d.addElement(new JsonElement(5));
		d.addElement(new XmlElement(7));
		d.addElement(new XmlElement(9));
		
		d.accept(v);
	}

}
