package doubleEndedList;

public class DoubleEndedList {

	private Link first;
	private Link last;
	
	public DoubleEndedList() {
		first = null;
		last = null;
	}
	public boolean isEmpty() {
		return (first == null);
	}
	public void insertFirst(int d) {
		Link newLink = new Link(d);		
		if(isEmpty()) 
			last = newLink;
		newLink.next = first;
		first = newLink;
	}
	public void insertLast(int d) {
		Link newLink = new Link(d);
		if(isEmpty())
			first = newLink;
		else
			last.next = newLink;
		last = newLink;
	}
	public int deleteFirst() {		//assumes non-empty list
		int temp = first.iData;
		if(first.next == null)
			last = null;
		first = first.next;
		return temp;
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
}
