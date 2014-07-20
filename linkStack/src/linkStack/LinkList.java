package linkStack;

public class LinkList {

	private Link first;
	
	public LinkList() {
		first = null;
	}
	public boolean isEmpty() {
		return (first == null);
	}
	public void insertFirst(int data) {
		Link newLink = new Link(data);
		newLink.next = first;
		first = newLink;
	}
	public int deleteFirst() {		//assumes non-empty list
		Link temp = first;
		first = first.next;
		return temp.iData;
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
