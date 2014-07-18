package PriorityQ;

public class priorityQApp {
	
	public static void main(String args[]) {
		
		double item;
		
		priorityQ thePQ = new priorityQ(5);
		thePQ.insert(60);
		thePQ.insert(40);
		thePQ.insert(70);
		thePQ.insert(50);
		thePQ.insert(30);
		
		while(!thePQ.isEmpty()) {
			item = thePQ.remove();
			System.out.print(item + " ");
		}
		System.out.println("");
	}

}
