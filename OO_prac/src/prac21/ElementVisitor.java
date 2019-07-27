package prac21;

public class ElementVisitor implements Visitor {

	public ElementVisitor() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void visit(XmlElement xe) {
		System.out.println("XML " + xe.getId());
	}
	
	@Override
	public void visit(JsonElement je) {
		System.out.println("JSON " + je.getID());
	}
	
}
