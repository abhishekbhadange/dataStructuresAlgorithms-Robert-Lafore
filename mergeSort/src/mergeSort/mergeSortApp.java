package mergeSort;

public class mergeSortApp {

	public static void main(String args []) {
		
		int maxSize = 100;
		Array arr = new Array(maxSize);
		
		arr.insert(45);
		arr.insert(27);
		arr.insert(59);
		arr.insert(33);
		arr.insert(128);
		arr.insert(50);
		arr.insert(12);
		arr.insert(97);
		arr.insert(3);
		
		arr.display();
		
		arr.mergeSort();
		
		arr.display();
	}
}
