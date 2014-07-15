package reverseApp;

public class StackX {

	private int stackSize;
	private char[] stackArray;
	private int top;
	
	public StackX(int maxSize) {
		stackSize = maxSize;
		stackArray = new char[stackSize];
		top = -1;
	}
	public void push(char x) {
		stackArray[++top] = x;
	}
	public char pop() {
		return stackArray[top--];
	}
	public char peek() {
		return stackArray[top];
	}
	public boolean isEmpty() {
		return (top == -1);
	}
}
