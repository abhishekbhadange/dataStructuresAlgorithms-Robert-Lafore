package doublyLinkedList;

public class ListApp {

	public static void main(String args[]) {
		
		DoublyLinkedList theList = new DoublyLinkedList();
		
		theList.insertFirst(11);
		theList.insertFirst(33);
		theList.insertFirst(55);
		
		theList.insertLast(22);
		theList.insertLast(44);
		theList.insertLast(66);
		
		theList.displayForward();
		theList.displayReverse();
		
		theList.deleteFirst();
		theList.deleteLast();
		theList.deleteKey(11);
		
		theList.displayForward();
		
		theList.insertAfter(33, 37);
		theList.insertAfter(22, 27);
		
		theList.displayForward();
	}
}
