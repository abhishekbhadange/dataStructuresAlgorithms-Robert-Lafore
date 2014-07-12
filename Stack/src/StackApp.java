
public class StackApp {
	
	public static void main(String args[]) {
		
		StackImp si = new StackImp(10);
		si.push(10);
		si.push(20);
		si.push(30);
		si.push(40);
		
		while(!si.isEmpty()) {	//until it's empty
			int value = si.pop();
			System.out.print(value);
			System.out.print(" ");
		}
		System.out.println("");
	}
}

