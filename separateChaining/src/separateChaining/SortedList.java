package separateChaining;

public class SortedList {

	private Link first;
	
	public SortedList() {
		first = null;
	}
	public void insert(Link item) {
		int key = item.iData;
		Link previous = null;
		Link current = first;
		while(current != null && key > current.iData) {
			previous = current;
			current = current.next;
		}
		if(previous == null)
			first = item;
		else
			previous.next = item;
		item.next = current;
	}
	public void delete(int key) {
		Link previous = null;
		Link current = first;
		while(current != null && current.iData != key) {
			previous = current;
			current = current.next;
		}
		if(previous == null)
			first = first.next;
		else
			previous.next = current.next;
	}
	public Link find(int key) {
		Link current = first;
		while(current != null && current.iData <= key) {
			if(key == current.iData)
				return current;
			current = current.next;
		}
		return null;
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
