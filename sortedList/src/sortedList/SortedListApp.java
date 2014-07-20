package sortedList;

public class SortedListApp {

	public static void main(String args[]) {
		
		SortedList theList = new SortedList();
		
		theList.insert(20);
		theList.insert(40);
		
		theList.displayList();
		
		theList.insert(10);
		theList.insert(30);
		theList.insert(50);
		
		theList.displayList();
		
		theList.remove();
		
		theList.displayList();
	}
}
