package BracketsApp;

import java.io.*;

public class bracketsApp {
	public static void main(String args[]) {
		String input;
		while(true) {
			try {
			System.out.print("Enter the string: ");
			System.out.flush();
			input = getString();
			
			if(input.equals(""))
				break;
			
			BracketChecker theChecker = new BracketChecker(input);
			theChecker.check();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static String getString() {
		String input = "";
		try {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		input = br.readLine();
		}
		catch(IOException io) {
			io.printStackTrace();
		}
		return input;
	}
}
