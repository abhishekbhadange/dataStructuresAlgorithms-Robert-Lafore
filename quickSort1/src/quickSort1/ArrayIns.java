package quickSort1;

public class ArrayIns {

	private int[] theArray;
	private int nItems;
	
	public ArrayIns(int maxSize) {
		theArray = new int[maxSize];
		nItems = 0;
	}
	public void insert(int data) {
		theArray[nItems++] = data;
	}
	public void display() {
		for(int i = 0; i < nItems; i++)
			System.out.print(theArray[i] + " ");
		System.out.println("");
	}
	public void quickSort() {
		recQuickSort(0, nItems - 1);
	}
	private void recQuickSort(int left, int right) {
		if(right - left <= 0)
			return;
		else {
			int partition = partitionIt(left, right, theArray[right]);
			recQuickSort(left, partition - 1);
			recQuickSort(partition + 1, right);
		}
	}
	private int partitionIt(int left, int right, int pivot) {
		int leftPtr = left - 1;
		int rightPtr = right;
		while(true) {
			while(theArray[++leftPtr] < pivot)
				;
			while(rightPtr > 0 && theArray[--rightPtr] > pivot)
				;
			if(leftPtr >= rightPtr)
				break;
			else
				swap(leftPtr, rightPtr);
		}
		swap(leftPtr, right);
		return leftPtr;
	}
	private void swap(int left, int right) {
		int temp = theArray[left];
		theArray[left] = theArray[right];
		theArray[right] = temp;
	}
}
