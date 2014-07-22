package interIterator;

import java.io.*;

public class InterIteratorApp {

	public static void main(String args[]) throws IOException {
		
		int value;
		
		LinkList theList = new LinkList();
		ListIterator iter = new ListIterator(theList);
		
		iter.insertAfter(20);
		iter.insertAfter(40);
		iter.insertAfter(80);
		iter.insertBefore(60);
		
		while(true) {
			System.out.print("Enter first letter of show, reset, ");
			System.out.print("next, get, before, after, delete: ");
			System.out.flush();
			int choice = getChar();
			switch(choice) {
				case 's':
					if(!theList.isEmpty())
						theList.displayList();
					else
						System.out.println("List is Empty!");
					break;
				case 'r':
					iter.reset();
					break;
				case 'n':
					if(!theList.isEmpty() && !iter.atEnd())
						iter.nextLink();
					else
						System.out.println("Can't go to the next line!");
					break;
				case 'g':
					if(!theList.isEmpty()) {
						value = iter.getCurrent().iData;
						System.out.println("Returned: " + value);
					}
					else
						System.out.println("List is empty!");
					break;
				case 'b':
					System.out.print("Enter value to insert: ");
					System.out.flush();
					value = getInt();
					iter.insertBefore(value);
					break;
				case 'a':
					System.out.print("Enter value to insert: ");
					System.out.flush();
					value = getInt();
					iter.insertAfter(value);
					break;
				case 'd':
					if(!theList.isEmpty()) {
						value = iter.deleteCurrent();
						System.out.println("Deleted: " + value);
					}
					else
						System.out.println("Can't delete!");
					break;
				default:
					System.out.println("Invalid Entry!");
			}
		}
	}
	public static int getChar() throws IOException {
		String s = getString();
		return s.charAt(0);
	}
	public static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
	public static int getInt() throws IOException {
		String s = getString();
		return Integer.parseInt(s);
	}
}
