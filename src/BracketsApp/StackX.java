package BracketsApp;

public class StackX {

	private int maxSize;
	private char[] stackArray;
	private int top;
	
	public StackX(int size) {
		maxSize = size;
		stackArray = new char[maxSize];
		top = -1;
	}
	public void push(char c) {
		stackArray[++top] = c;
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
