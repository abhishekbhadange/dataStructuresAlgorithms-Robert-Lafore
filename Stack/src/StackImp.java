class StackImp {
	
	private int stackSize;
	private int[] stackArray;
	private int top;
	
	public StackImp(int s) {
		stackSize = s;
		stackArray = new int[stackSize];
		top = -1;
	}
	public void push(int k) {
		stackArray[++top] = k;
	}
	public int pop() {
		return stackArray[top--];
	}
	public boolean isFull() {			//true if stack is full
		return (top == stackSize-1);
	}
	public boolean isEmpty() {
		return (top == -1);				//true if stack is empty
	}
	public int peek() {
		return stackArray[top];
	}
	
}