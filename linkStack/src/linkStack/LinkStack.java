package linkStack;

public class LinkStack {
	
	private LinkList theList;
	
	public LinkStack() {
		theList = new LinkList();
	}
	public boolean isEmpty() {
		return theList.isEmpty();
	}
	public void push(int data) {
		theList.insertFirst(data);
	}
	public int pop() {
		return theList.deleteFirst();
	}
	public void displayStack() {
		System.out.print("Stack (top --> bottom): ");
		theList.displayList();
	}
}
