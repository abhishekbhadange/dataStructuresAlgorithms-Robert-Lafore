package linkList2;

public class LinkList2 {

	private Link first;
	
	public LinkList2() {
		first = null;
	}
	public void insertFirst(int id, double dd) {
		Link newLink = new Link(id, dd);
		newLink.next = first;
		first = newLink;
	}
	public Link find(int key) {		//assumes non-empty list
		Link current = first;
		while(current.iData != key) {
			if(current.next == null) 
				return null;
			else
				current = current.next;
		}
		return current;
	}
	public Link delete(int key) {	//assumes non-empty list
		Link current = first;
		Link previous = first;
		while(current.iData != key) {
			if(current.next == null)
				return null;
			else {
				previous = current;
				current = current.next;
			}
		}
		if(current == first)
			first = first.next;
		else 
			previous.next = current.next;
		return current;
	}
	public void displayList() {
		System.out.print("List (first --> last): ");
		Link current = first;
		while(current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
	public boolean isEmpty() {
		return (first == null);
	}
}
