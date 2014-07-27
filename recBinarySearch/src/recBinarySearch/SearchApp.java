package recBinarySearch;

public class SearchApp {

	public static void main(String args[]) {
		int maxSize = 100;
		OrdArray arr = new OrdArray(maxSize);
		
		arr.insert(78);
		arr.insert(90);
		arr.insert(43);
		arr.insert(81);
		arr.insert(121);
		arr.insert(15);
		arr.insert(50);
		arr.insert(23);
		arr.insert(99);
		
		arr.display();
		
		int searchKey = 78;
		
		if(arr.find(searchKey) != arr.size())
			System.out.println("Found " + searchKey);
		else
			System.out.println("Not found " + searchKey);		
	}
}
