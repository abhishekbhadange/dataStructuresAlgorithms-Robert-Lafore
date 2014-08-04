package separateChaining;

public class HashTable {

	private SortedList[] hashArray;
	private int arraySize;
	
	public HashTable(int size) {
		arraySize = size;
		hashArray = new SortedList[arraySize];
		for(int j = 0; j < arraySize; j++)
			hashArray[j] = new SortedList();
	}
	public int hashFunc(int key) {
		return key % arraySize;
	}
	public void insert(Link item) {
		int key = item.iData;
		int hashVal = hashFunc(key);
		hashArray[hashVal].insert(item);
	}
	public void delete(int key) {
		int hashVal = hashFunc(key);
		hashArray[hashVal].delete(key);
	}
	public Link find(int key) {
		int hashVal = hashFunc(key);
		Link temp = hashArray[hashVal].find(key);
		return temp;
	}
	public void displayTable() {
		for(int j = 0; j < arraySize; j++) {
			System.out.print(j + ". ");
			hashArray[j].displayList();
		}
		System.out.println("");
	}
}
