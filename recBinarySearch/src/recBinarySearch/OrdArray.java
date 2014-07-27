package recBinarySearch;

public class OrdArray {
	
	private int[] arr;
	private int nElem;
	
	public OrdArray(int maxSize) {
		arr = new int[maxSize];
		nElem = 0;
	}
	public int size() {
		return nElem;
	}
	public int find(int key) {
		return recFind(key, 0, nElem - 1);
	}
	private int recFind(int key, int lowerBound, int upperBound) {
		int currInd;
		currInd = (upperBound + lowerBound)/2;
		if(arr[currInd] == key)
			return currInd;
		else if(lowerBound > upperBound)
			return nElem;
		else {
			if(arr[currInd] > key)
				return recFind(key, lowerBound, currInd - 1);
			else
				return recFind(key, currInd + 1, upperBound);
		}
	}
	public void insert(int data) {
		int j;
		for(j = 0; j < nElem; j++) {
			if(arr[j] > data)
				break;
		}
		for(int k = nElem; k > j; k--) {
			arr[k] = arr[k-1];
		}
		arr[j] = data;
		nElem++;
	}
	public void display() {
		for(int i = 0; i < size(); i++)
			System.out.print(arr[i] + " ");
		System.out.println("");
	}
}
