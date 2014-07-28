package insertionSort;

public class ArrayInsert {

	private int[] arr;
	private int nItems;
	
	public ArrayInsert(int maxSize) {
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
	public void insertionSort() {
		int in, out, temp;
		for(out = 1; out < nItems; out++) {
			temp = arr[out];
			in = out;
			while(in > 0 && arr[in-1] >= temp) {
				arr[in] = arr[in - 1];
				--in;
			}
			arr[in] = temp;
		}
	}
}
