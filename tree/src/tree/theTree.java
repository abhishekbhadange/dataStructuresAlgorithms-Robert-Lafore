package tree;

public class theTree {
	
	private Node root;
	
	public theTree() {
		root = null;
	}
	public Node find(int key) {
		Node current = root;
		while(current.iData != key) {
			if(key < current.iData)
				current = current.leftChild;
			else
				current = current.rightChild;
			if(current == null)
				return null;
		}
		return current;
	}
	public void insert(int data) {
		Node newNode = new Node(data);
		if(root == null)
			root = newNode;
		else {
			Node current = root;
			Node parent;
			while(true) {
				parent = current;
				if(data < current.iData) {
					current = current.leftChild;
					if(current == null) {
						parent.leftChild = newNode;
						return;
					}
				}
				else {
					current = current.rightChild;
					if(current == null) {
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}
	public boolean delete(int key) {
		
		Node current = root;
		Node parent = root;
		boolean isLeftChild = true;
		
		while(current.iData != key) {
			parent = current;
			if(key < current.iData) {
				current = current.leftChild;
				isLeftChild = true;
			}
			else {
				current = current.rightChild;
				isLeftChild = false;
			}
			if(current == null)
				return false;
		}
		
		if(current.leftChild == null && current.rightChild == null) {
			if(current == root)
				root = null;
			else if(isLeftChild)
				parent.leftChild = null;
			else
				parent.rightChild = null;
		}
		
		if(current.leftChild == null) {
			if(current == root)
				root = current.rightChild;
			else if(isLeftChild)
				parent.leftChild = current.rightChild;
			else
				parent.rightChild = current.rightChild;
		}
		
		else if(current.rightChild == null) {
			if(current == root)
				root = current.leftChild;
			else if(isLeftChild)
				parent.leftChild = current.leftChild;
			else
				parent.rightChild = current.leftChild;
		}
		
		else {
			Node successor = getSuccessor(current);
			
			if(current == root)
				root = successor;
			else if(isLeftChild)
				parent.leftChild = successor;
			else
				parent.rightChild = successor;
			
			successor.leftChild = current.leftChild;
		}
		return true;
	}
	private Node getSuccessor(Node deleteItem) {
		Node successor = deleteItem;
		Node successorParent = deleteItem;
		Node current = deleteItem.rightChild;
		while(current != null) {
			successorParent = successor;
			successor = current;
			current = current.leftChild;			
		}
		if(deleteItem.rightChild != successor) {
			successorParent.leftChild = successor.rightChild;
			successor.rightChild = deleteItem.rightChild;
		}
		return successor;
	}
	public void traverse(int traverseType) {
		switch(traverseType) {
			case 1: 
				System.out.print("\nPreorder traversal: ");
				preOrder(root);
				break;
			case 2:	
				System.out.print("\nInorder traversal: ");
				inOrder(root);
				break;
			case 3:
				System.out.print("\nPostorder traversal: ");
				postOrder(root);
				break;
		}
		System.out.println("");
	}

	private void preOrder(Node current) {
		if(current != null) {
			System.out.print(current.iData + " ");
			preOrder(current.leftChild);
			preOrder(current.rightChild);
		}
	}
	private void inOrder(Node current) {
		if(current != null) {
			inOrder(current.leftChild);
			System.out.print(current.iData + " ");
			inOrder(current.rightChild);
		}
	}
	private void postOrder(Node current) {
		if(current != null) {
			postOrder(current.leftChild);
			postOrder(current.rightChild);
			System.out.print(current.iData + " ");
		}
	}

}
