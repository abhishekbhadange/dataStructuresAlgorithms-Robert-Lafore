package reverseApp;

public class Reverser {

	private String input;
	private String output = "";
	private char ch;
	
	public Reverser(String ip) {
		input = ip;
	}
	public String doReverse() {
		int size = input.length();
		StackX theStack = new StackX(size);
		
		for(int i=0; i<size; i++) {
			ch = input.charAt(i);
			theStack.push(ch);
		}
		
		while(!theStack.isEmpty()) {
			ch = theStack.pop();
			output += ch;
		}
		
		return output;
	}
}
