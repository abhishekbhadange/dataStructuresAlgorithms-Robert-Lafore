package separateChaining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HashChainApp {

public static void main(String[] args) throws IOException {
		
		Link item;
		int value, size, n, keysPerCell, temp;
		
		putText("Enter the size of Hash Table: ");
		size = getInt();
		putText("Enter the initial number of items: ");
		n = getInt();
		keysPerCell = 100;
		
		HashTable theTable = new HashTable(size);
		
		for(int i = 0; i < n; i++) {
			temp = (int)(java.lang.Math.random() * keysPerCell * size);
			item = new Link(temp);
			theTable.insert(item);
		}
		
		while(true) {
			putText("Enter initial letter of your choice (show, insert, find, delete): ");
			char choice = getChar();

			switch(choice) {
			case 's':
				theTable.displayTable();
				break;
			case 'i':
				putText("Enter the key of the item to be inserted: ");
				value = getInt();
				item = new Link(value);
				theTable.insert(item);
				break;
			case 'f':
				putText("Enter the key of the item to be found: ");
				value = getInt();
				item = theTable.find(value);
				if(item != null)
					System.out.println("Found " + item.iData);
				else
					System.out.println("Can't find " + value);
				break;
			case 'd':
				putText("Enter the key of the item to be deledted: ");
				value = getInt();
				theTable.delete(value);
				break;
			default:
				putText("Invalid choice!");
			}
		}
	}
	public static void putText (String s) {
		System.out.print(s);
		System.out.flush();
	}
	public static String getString() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		return s;
	}
	public static int getInt() throws IOException {
		String s = getString();
		return Integer.parseInt(s);
	}
	public static char getChar() throws IOException {
		String s = getString();
		return s.charAt(0);
	}
}
