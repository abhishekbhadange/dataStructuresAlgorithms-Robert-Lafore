package queueApp;

public class Queue {
	
	private int front, rear;
	private int[] queueArray;
	private int nitems, qsize;
	
	public Queue(int maxSize) {
		qsize = maxSize;
		queueArray = new int[qsize];
		front = 0;
		rear = -1;
		nitems = 0;
	}
	public void insert(int j) {
		if(rear == qsize-1)
			rear = -1;
		queueArray[++rear] = j;
		nitems++;
	}
	public int remove() {
		int temp = queueArray[front++];
		if(front == qsize)
			front = 0;
		nitems--;
		return temp;
	}
	public int peek() {
		return queueArray[front];
	}
	public boolean isEmpty() {
		return (nitems == 0);
	}
	public boolean isFull() {
		return (nitems == qsize);
	}
	public int size() {
		return nitems;
	}
	
}
