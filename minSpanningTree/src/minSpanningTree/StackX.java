package minSpanningTree;

public class StackX {

	private final int SIZE = 20;
	private int[] stArray;
	private int top;
	
	public StackX() {
		stArray = new int[SIZE];
		top = -1;
	}
	public void push(int value) {
		stArray[++top] = value;
	}
	public int pop() {
		return stArray[top--];
	}
	public boolean isEmpty() {
		return (top == -1);
	}
	public int peek() {
		return stArray[top];
	}
}
