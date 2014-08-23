package depthFirstSearch;

public class StackX {

	private final int MAX_SIZE = 20;
	private int[] theArray;
	private int top;
	
	public StackX() {
		theArray = new int[MAX_SIZE];
		top = -1;
	}
	public void push(int data) {
		theArray[++top] = data;
	}
	public int pop() {
		return theArray[top--];
	}
	public int peek() {
		return theArray[top];
	}
	public boolean isEmpty() {
		return (top == -1);
	}
}
