package sortedList;

public class SortedList {

	private Link first;
	
	public SortedList() {
		first = null;
	}
	public boolean isEmpty() {
		return (first == null);
	}
	public void insert(int key) {
		Link newLink = new Link(key);
		Link previous = null;
		Link current = first;
		while(current != null && key > current.iData) {
			previous = current;
			current = current.next;
		}
		if(previous == null)
			first = newLink;
		else
			previous.next = newLink;
		newLink.next = current;
	}
	public Link remove() {		//assumes non-empty list
		Link temp = first;
		first = first.next;
		return temp; 
	}
	public void displayList() {
		System.out.print("List (front --> rear): ");
		Link current = first;
		while(current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
}
