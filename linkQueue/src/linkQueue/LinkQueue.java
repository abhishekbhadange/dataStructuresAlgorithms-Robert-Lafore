package linkQueue;

public class LinkQueue {

	private DoubleEndedList theList;
	
	public LinkQueue() {
		theList = new DoubleEndedList();
	}
	public boolean isEmpty() {
		return theList.isEmpty();
	}
	public void insert(int data) {
		theList.insertLast(data);
	}
	public int remove() {
		return theList.deleteFirst();
	}
	public void displayQueue() {
		System.out.print("Queue (front --> rear): ");
		theList.displayList();
	}
}
