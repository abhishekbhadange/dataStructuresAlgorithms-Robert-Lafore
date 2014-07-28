package insertionSort;

public class InsertionSortApp {

	public static void main(String args[]) {
		
		int maxSize = 100;
		ArrayInsert arr = new ArrayInsert(maxSize);
		
		arr.insert(56);
		arr.insert(12);
		arr.insert(78);
		arr.insert(37);
		arr.insert(178);
		arr.insert(67);
		arr.insert(88);
		arr.insert(126);
		arr.insert(9);
		
		arr.display();
		
		arr.insertionSort();
		
		arr.display();
	}
}
