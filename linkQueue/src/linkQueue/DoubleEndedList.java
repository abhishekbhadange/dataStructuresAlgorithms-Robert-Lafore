package linkQueue;

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
	public void insertLast(int data) {
		Link newLink = new Link(data);
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
		Link current = first;
		while(current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
}
