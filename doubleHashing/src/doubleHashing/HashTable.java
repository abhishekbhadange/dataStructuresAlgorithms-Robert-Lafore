package doubleHashing;

public class HashTable {
	
	private DataItem[] hashArray;
	private int arraySize;
	private DataItem nonItem;
	
	public HashTable(int size) {
		arraySize = size;
		hashArray = new DataItem[arraySize];
		nonItem = new DataItem(-1);
	}
	public void displayTable() {
		System.out.print("Table: ");
		for(int i = 0; i < arraySize; i++) {
			if(hashArray[i] != null)
				System.out.print(hashArray[i].iData + " ");
			else
				System.out.print("** ");
		}
		System.out.println("");
	}
	private int hashFunc1(int key) {
		return key % arraySize;
	}
	private int hashFunc2(int key) {
		return 5 - key % 5;
	}
	public void insert(DataItem item) {		// assumes table not full
		int key = item.iData;
		int hashVal = hashFunc1(key);
		int stepSize = hashFunc2(key);
		while(hashArray[hashVal] != null && hashArray[hashVal].iData != -1) {
			hashVal += stepSize;
			hashVal %= arraySize;		// wrap around if necessary
		}
		hashArray[hashVal] = item;
	}
	public DataItem delete(int key) {
		int hashVal = hashFunc1(key);
		int stepSize = hashFunc2(key);
		while(hashArray[hashVal] != null) {
			if(hashArray[hashVal].iData == key) {
				DataItem temp = hashArray[hashVal];
				hashArray[hashVal] = nonItem;
				return temp;
			}
			hashVal += stepSize;
			hashVal %= arraySize;		// wrap around if necessary
		}
		return null;
	}
	public DataItem find(int key) {		// assumes table not full
		int hashVal = hashFunc1(key);
		int stepSize = hashFunc2(key);
		while(hashArray[hashVal] != null) {
			if(hashArray[hashVal].iData == key)
				return hashArray[hashVal];
			hashVal += stepSize;
			hashVal %= arraySize;		// wrap around if necessary
		}
		return null;
	}
}
