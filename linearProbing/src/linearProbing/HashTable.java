package linearProbing;

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
	private int hashFunc(int key) {
		return key % arraySize;
	}
	public void insert(DataItem item) {			// assumes hash table not full
		int key = item.iData;							
		int hashValue = hashFunc(key);
		while(hashArray[hashValue] != null && hashArray[hashValue].iData != -1) {
			++hashValue;
			hashValue %= arraySize;			   // wrap around feature
		}
		hashArray[hashValue] = item;
	}
	public DataItem find(int key) {
		int hashValue = hashFunc(key);
		while(hashArray[hashValue] != null) {
			if(hashArray[hashValue].iData == key) 
				return hashArray[hashValue];
			++hashValue;
			hashValue %= arraySize;
		}
		return null;
	}
	public DataItem delete(int key) {
		int hashValue = hashFunc(key);
		while(hashArray[hashValue] != null) {
			if(hashArray[hashValue].iData == key) {
				DataItem temp = hashArray[hashValue];
				hashArray[hashValue] = nonItem;
				return temp;
			}
			++hashValue;
			hashValue %= arraySize;
		}
		return null;
	}
}
