package interIterator;

public class LinkList {

	private Link first;
	
	public LinkList() {
		first = null;
	}
	public Link getFirst() {
		return first;
	}
	public void setFirst(Link node) {
		first = node;
	}
	public boolean isEmpty() {
		return (first == null);
	}
	public ListIterator getIterator(LinkList theList) {
		return new ListIterator(theList);
	}
	public void displayList() {
		Link current = first;
		while(current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
}
