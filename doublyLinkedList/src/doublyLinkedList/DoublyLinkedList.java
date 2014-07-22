package doublyLinkedList;

public class DoublyLinkedList {

	private Link first;
	private Link last;
	
	public DoublyLinkedList() {
		first = null;
		last = null;
	}
	public boolean isEmpty() {
		return (first == null);
	}
	public void insertFirst(int data) {
		Link newLink = new Link(data);
		if(isEmpty()) 
			last = newLink;
		else {
			first.previous = newLink;
			newLink.next = first;
		}
		first = newLink;
	}
	public void insertLast(int data) {
		Link newLink = new Link(data);
		if(isEmpty())
			first = newLink;
		else {
			last.next = newLink;
			newLink.previous = last;
		}
		last = newLink;
	}
	public Link deleteFirst() {		//assumes non-empty list
		Link temp = first;
		if(first.next == null)
			last = null;
		else
			first.next.previous = null;
		first = first.next;
		return temp;
	}
	public Link deleteLast() {		//assumes non-empty list
		Link temp = last;
		if(last.previous == null)
			first = null;
		else
			last.previous.next = null;
		last = last.previous;
		return temp;
	}
	public boolean insertAfter(int key, int data) {		//assumes non-empty list 
		Link current = first;
		while(current.iData != key) {
			current = current.next;
			if(current == null)
				return false;
		}
		Link newLink = new Link(data);
		if(current == last) {
			newLink.next = null;
			last = newLink;
		}
		else {
			newLink.next = current.next;
			current.next.previous = newLink;			
		}
		newLink.previous = current;
		current.next = newLink;
		return true; 
	}
	public Link deleteKey(int key){		//assumes non-empty list
		Link current = first;
		while(current.iData != key) {
			current = current.next;
			if(current == null)
				return null;
		}
		if(current == first)
			first = current.next;
		else
			current.previous.next = current.next;
		if(current == last)
			last = current.previous;
		else
			current.next.previous = current.previous;
		return current;
	}
	public void displayForward() {
		System.out.print("List (front --> rear): ");
		Link current = first;
		while(current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
	public void displayReverse() {
		System.out.print("List (rear --> front): ");
		Link current = last;
		while(current != null) {
			current.displayLink();
			current = current.previous;
		}
		System.out.println("");
	}
}
