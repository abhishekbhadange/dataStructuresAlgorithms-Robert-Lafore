package heapSort;

public class Heap {

	private Node[] heapArray;
	private int maxSize;
	private int currentSize;
	
	public Heap(int mx) {
		maxSize = mx;
		currentSize = 0;
		heapArray = new Node[maxSize];
	}
	public Node remove() {			//assumes non-empty list
		Node root = heapArray[0];
		heapArray[0] = heapArray[--currentSize];
		trickleDown(0);
		return root;
	}
	public void trickleDown(int index) {
		int largerChild;
		Node top = heapArray[index];
		while(index < currentSize/2) {
			
			int leftChild = 2 * index + 1;
			int rightChild = leftChild + 1;
			
			if(rightChild < currentSize && heapArray[leftChild].getKey() < heapArray[rightChild].getKey())
				largerChild = rightChild;
			else
				largerChild = leftChild;
			
			if(top.getKey() >= heapArray[largerChild].getKey())
				break;
			
			heapArray[index] = heapArray[largerChild];
			index = largerChild;
		}
		heapArray[index] = top;
	}
	public void displayArray() {
		for(int i = 0; i < maxSize; i++)
			System.out.print(heapArray[i].getKey() + " ");
		System.out.println("");
	}
	public void insertAt(int index, Node newNode) {
		heapArray[index] = newNode;
	}
	public void incrementSize() {
		currentSize++;
	}
}
