package doubleEndedList;

public class DEListApp {

	public static void main(String args[]) {
		
		DoubleEndedList theList = new DoubleEndedList();
		
		theList.insertFirst(22);
		theList.insertFirst(44);
		theList.insertFirst(66);
		
		theList.insertLast(11);
		theList.insertLast(33);
		theList.insertLast(55);
		
		theList.displayList();
		
		theList.deleteFirst();
		theList.deleteFirst();
		
		theList.displayList();
	}
}
