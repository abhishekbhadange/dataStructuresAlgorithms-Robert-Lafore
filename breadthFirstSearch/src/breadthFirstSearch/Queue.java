package breadthFirstSearch;

public class Queue {

	private final int MAX_SIZE = 20;
	private int[] queArray;
	private int front, rear;
	
	public Queue() {
		queArray = new int[MAX_SIZE];
		front = 0;
		rear = -1;
	}
	public void insert(int val) {
		if(rear == MAX_SIZE-1)
			rear = -1;
		queArray[++rear] = val;
	}
	public int remove() {
		int temp = queArray[front++];
		if(front == MAX_SIZE)
			front = 0;
		return temp;
	}
	public boolean isEmpty() {
		return (rear+1 == front || (front + MAX_SIZE-1 == rear));
	}
}
