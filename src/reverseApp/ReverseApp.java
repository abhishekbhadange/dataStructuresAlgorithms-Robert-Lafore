package reverseApp;

import java.io.*; 

public class ReverseApp {
	
	public static void main(String args[]) {
		String input, output;
		try {
			while(true) {
				System.out.print("Enter the string: ");
				System.out.flush();
				input = getString();
				
				if(input.equals(""))
					break;
				
				Reverser rev = new Reverser(input);
				output = rev.doReverse();
				System.out.println("Reversed string: " + output);
			}			
		}
		catch(Exception e) {
			System.out.println("Exception occurred!");
			e.printStackTrace();
		}
	}
	
	public static String getString() {
		String s = "";
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			s = br.readLine();
		}
		catch(IOException io) {
			System.out.println("IOException occurred!");
			io.printStackTrace();
		}
		return s;
	}
}
