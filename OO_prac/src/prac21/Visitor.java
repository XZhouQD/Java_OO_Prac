package prac21;

public interface Visitor {
	public void visit (XmlElement xe);
	public void visit (JsonElement je);
}
