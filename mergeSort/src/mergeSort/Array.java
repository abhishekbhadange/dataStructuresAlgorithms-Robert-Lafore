package mergeSort;

public class Array {

	private int[] arr;
	private int nItems;
	
	public Array(int maxSize) {
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
	public void mergeSort() {
		int[] workSpace = new int[arr.length];
		recMergeSort(workSpace, 0, nItems - 1);
	}
	private void recMergeSort(int[] workSpace, int lowerBound, int upperBound) {
		if(lowerBound == upperBound)
			return;
		else {
			int mid = (lowerBound + upperBound)/2;
			recMergeSort(workSpace, lowerBound, mid);
			recMergeSort(workSpace, mid + 1, upperBound);
			merge(workSpace, lowerBound, mid + 1, upperBound);
		}
	}
	private void merge(int[] workSpace, int lowPtr, int highPtr, int upperBound) {
		
		int j = 0;
		int lowerBound = lowPtr;
		int mid = highPtr - 1;
		int n = upperBound - lowerBound + 1;
		
		while(lowPtr <= mid && highPtr <= upperBound) {
			if(arr[lowPtr] < arr[highPtr])
				workSpace[j++] = arr[lowPtr++];
			else
				workSpace[j++] = arr[highPtr++];
		}
		while(lowPtr <= mid)
			workSpace[j++] = arr[lowPtr++];
		while(highPtr <= upperBound)
			workSpace[j++] = arr[highPtr++];
		
		for(j = 0; j < n; j++)
			arr[lowerBound + j] = workSpace[j];
	}
}
