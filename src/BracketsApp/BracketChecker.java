package BracketsApp;

public class BracketChecker {

	String input;
	public BracketChecker(String in) {
		input = in;
	}
	public void check() {
		char ch, chx;
		int size = input.length();
		StackX theStack = new StackX(size);
		for(int i=0; i<size; i++) {
			ch = input.charAt(i);
			
			switch(ch) {
				
				case '{':
				case '[':
				case '(':
					theStack.push(ch);
					break;
				
				case '}':
				case ']':
				case ')':
					if(!theStack.isEmpty()) {
						chx = theStack.pop();
						if((ch == '}' && chx != '{') || (ch == ']' && chx != '[')
							|| (ch == ')' && chx != '(')) {
							System.out.println("Error: "+ch+" at "+i);
						}
					}
					else {								//prematurely empty
						System.out.println("Error: "+ch+" at "+i);
					}
					break;
				default:
					break;
			}
		}
		if(!theStack.isEmpty()){
			System.out.println("Error: missing right delimiter!");
		}
	}
}
