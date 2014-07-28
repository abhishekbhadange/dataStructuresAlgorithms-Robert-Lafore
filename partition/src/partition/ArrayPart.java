package partition;

public class ArrayPart {

	private int[] arr;
	private int nItems;
	
	public ArrayPart(int maxSize) {
		arr = new int[maxSize];
		nItems = 0;
	}
	public void insert(int data) {
		arr[nItems++] = data;
	}
	public int size() {
		return nItems;
	}
	public void display() {
		System.out.print("A : ");
		for(int j = 0; j < nItems; j++)
			System.out.print(arr[j] + " ");
		System.out.println("");
	}
	public int partitionIt(int left, int right, int pivot) {
		int leftPtr = left - 1;
		int rightPtr = right + 1;
		while(true) {
			while(leftPtr < right && arr[++leftPtr] < pivot)
				;
			while(rightPtr > left && arr[--rightPtr] > pivot)
				;
			if(leftPtr >= rightPtr)
				break;
			else
				swap(leftPtr, rightPtr);
		}
		return leftPtr;
	}
	private void swap(int left, int right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}
}
