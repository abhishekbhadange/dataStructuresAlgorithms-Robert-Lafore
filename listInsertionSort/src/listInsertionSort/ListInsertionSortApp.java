package listInsertionSort;

public class ListInsertionSortApp {

	public static void main(String args[]) {
	
		int size = 10, j, n;
	
		Link[] linkArr = new Link[size];
		for(j = 0; j < size; j++) {
			n = (int)(java.lang.Math.random()*99);
			Link newLink = new Link(n);
			linkArr[j] = newLink;
		}
		
		System.out.print("Unsorted array: ");
		for(j = 0; j < size; j++)
			System.out.print(linkArr[j].iData + " ");
		System.out.println("");
		
		SortedList theList = new SortedList(linkArr);
		
		for(j = 0; j < size; j++)
			linkArr[j] = theList.remove();
		
		System.out.print("Sorted array: ");
		for(j = 0; j < size; j++)
			System.out.print(linkArr[j].iData + " ");
		System.out.println("");
	}
}
