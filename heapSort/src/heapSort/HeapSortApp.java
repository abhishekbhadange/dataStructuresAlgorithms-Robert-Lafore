package heapSort;

import java.io.*;

public class HeapSortApp {

	public static void main(String[] args) throws IOException {
		
		int size, j;
		
		System.out.print("Enter total size: ");
		size = getInt();
		
		Heap theHeap = new Heap(size);
		
		for(j = 0; j < size; j++) {
			int random = (int)(java.lang.Math.random()*100);
			Node newNode = new Node(random);
			theHeap.insertAt(j, newNode);
			theHeap.incrementSize();
		}
		
		System.out.print("Random Array: ");
		theHeap.displayArray();
		
		for(j = size/2-1; j >= 0; j--)
			theHeap.trickleDown(j);
		
		System.out.print("Heap: ");
		theHeap.displayArray();
		
		for(j = size-1; j >= 0; j--) {
			Node biggestNode = theHeap.remove();
			theHeap.insertAt(j, biggestNode);
		}
		
		System.out.print("Sorted Array: ");
		theHeap.displayArray();
	}
	public static String getString() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		return s;
	}
	public static int getInt() throws IOException {
		String s = getString();
		return Integer.parseInt(s);
	}
}
