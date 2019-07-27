package prac21;

import java.util.ArrayList;
import java.util.List;

public class Document extends Element {

	private List<Element> elements = new ArrayList<>();
	
	public Document() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accept(Visitor v) {
		for (Element e : this.elements) {
			e.accept(v);
		}
	}
	
	public void addElement(Element e) {
		elements.add(e);
	}

}
