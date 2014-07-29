package quickSort2;

public class ArrayIns {
	
	private int[] arr;
	private int nItems;
	
	public ArrayIns(int maxSize) {
		arr = new int[maxSize];
		nItems = 0;
	}
	public void insert(int data) {
		arr[nItems++] = data;
	}
	public void display() {
		for(int j = 0; j < nItems; j++)
			System.out.print(arr[j] + " ");
		System.out.println("");
	}
	public void quickSort() {
		recQuickSort(0, nItems - 1);
	}
	private void recQuickSort(int left, int right) {
		int size = right - left + 1;
		if(size <= 3)
			manualSort(left, right);
		else {
			int median = medianOf3(left, right);
			int partition = partitionIt(left, right, median);
			recQuickSort(left, partition - 1);
			recQuickSort(partition + 1, right);
		}
	}
	private void manualSort(int left, int right) {
		int size = right - left + 1;
		if(size <= 1)
			return;
		if(size == 2) {
			if(arr[left] > arr[right])
				swap(left, right);
			return;
		}
		else {
			if(arr[left] > arr[right - 1])
				swap(left, right - 1);
			if(arr[left] > arr[right])
				swap(left, right);
			if(arr[right - 1] > arr[right])
				swap(right - 1, right);
		}
	}
	private void swap(int left, int right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}
	private int medianOf3(int left, int right) {
		int center = (left + right)/2;
		if(arr[left] > arr[center])
			swap(left, center);
		if(arr[left] > arr[right])
			swap(left, right);
		if(arr[center] > arr[right])
			swap(center, right);
		swap(center, right - 1);
		return arr[right - 1];
	}
	private int partitionIt(int left, int right, int pivot) {
		int leftPtr = left;
		int rightPtr = right - 1;
		while(true) {
			while(arr[++leftPtr] < pivot)
				;
			while(arr[--rightPtr] > pivot)
				;
			if(leftPtr >= rightPtr)
				break;
			else 
				swap(leftPtr, rightPtr);
		}
		swap(leftPtr, right - 1);
		return leftPtr;
	}
}
