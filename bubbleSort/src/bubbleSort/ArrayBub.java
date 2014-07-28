package bubbleSort;

public class ArrayBub {
	
	private int[] arr;
	private int nItems;
	
	public ArrayBub(int maxSize) {
		arr = new int[maxSize];
		nItems = 0;
	}
	public void insert(int data) {
		arr[nItems++] = data;
	}
	public void display() {
		for(int i = 0; i < nItems; i++)
			System.out.print(arr[i] + " ");
		System.out.println("");
	}
	public void bubbleSort() {
		int in, out, temp;
		for(out = nItems - 1; out > 0; out--) {
			for(in = 0; in < out; in++) {
				if(arr[in] > arr[in + 1]) {
					temp = arr[in];
					arr[in] = arr[in + 1];
					arr[in + 1] = temp;
				}
			}
		}
	}
}
