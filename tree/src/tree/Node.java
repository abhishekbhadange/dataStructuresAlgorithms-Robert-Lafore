package tree;

public class Node {

	public int iData;
	public Node leftChild;
	public Node rightChild;
	
	public Node(int data) {
		iData = data;
		leftChild = null;
		rightChild = null;
	}
	public void display() {
		System.out.print(iData + " ");
	}
}
