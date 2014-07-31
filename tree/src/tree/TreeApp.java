package tree;

import java.io.*;

public class TreeApp {

	public static void main(String args[]) throws IOException {
		
		int value;
		theTree tree = new theTree();
		
		tree.insert(50);
		tree.insert(25);
		tree.insert(75);
		tree.insert(12);
		tree.insert(37);
		tree.insert(43);
		tree.insert(30);
		tree.insert(33);
		tree.insert(87);
		tree.insert(93);
		tree.insert(97);
		
		while(true) {
			System.out.print("Enter first letter of insert, ");
			System.out.print("delete, find, or traverse: ");
			char choice = getChar();
			switch(choice) {
			case 'i':
				System.out.print("Enter data value to insert: ");
				System.out.flush();
				value = getInt();
				tree.insert(value);
				break;
			case 'f':
				System.out.print("Enter key value to find: ");
				System.out.flush();
				value = getInt();
				Node temp = tree.find(value);
				if(temp != null)
					System.out.println("Found " + temp.iData);
				else
					System.out.println("Not found " + value);
				break;
			case 'd':
				System.out.print("Enter key value to delete: ");
				System.out.flush();
				value = getInt();
				if(tree.delete(value))
					System.out.println("Deleted " + value);
				else
					System.out.println("Can't delete " + value);
				break;
			case 't':
				System.out.print("Enter 1 for Preorder traversal, 2 for ");
				System.out.print("Inorder Traversal, 3 for Postorder Traversal: ");
				System.out.flush();
				value = getInt();
				tree.traverse(value);
				break;
			}
		}
		
	}
	public static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
	public static char getChar() throws IOException {
		String s = getString();
		return s.charAt(0);
	}
	public static int getInt() throws IOException {
		String s = getString();
		return Integer.parseInt(s);
	}
}
