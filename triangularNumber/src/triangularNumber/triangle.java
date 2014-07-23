package triangularNumber;

import java.io.*;

public class triangle {

	public static void main(String args[]) throws IOException {
		
		int inputValue, outputValue;
		System.out.print("Enter a number: ");
		System.out.flush();
		inputValue = getInt();
		outputValue = getValue(inputValue);
		System.out.println("Triangle: " + outputValue);
	}
	public static int getValue(int no) {
		if(no == 1)
			return 1;
		else
			return (no + getValue(no - 1));
	}
	public static int getInt() throws IOException {
		String s = getString();
		return Integer.parseInt(s);
	}
	public static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
}
