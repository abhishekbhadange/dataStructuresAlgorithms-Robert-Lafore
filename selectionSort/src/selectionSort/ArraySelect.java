package selectionSort;

public class ArraySelect {

	private int[] arr;
	private int nItems;
	
	public ArraySelect(int maxSize) {
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
	public void selectionSort() {
		int in, out, min, temp;
		for(out = 0; out < nItems - 1; out++) {
			min = out;
			for(in = out + 1; in < nItems; in++) {
				if(arr[in] < arr[min])
					min = in;
			}
			temp = arr[out];
			arr[out] = arr[min];
			arr[min] = temp;
		}
	}
}
