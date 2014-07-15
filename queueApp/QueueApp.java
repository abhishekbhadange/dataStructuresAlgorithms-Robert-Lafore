package queueApp;

public class QueueApp {

	public static void main(String[] args) {
		Queue theQueue = new Queue(5);
		
		theQueue.insert(10);
		theQueue.insert(20);
		theQueue.insert(30);
		theQueue.insert(40);
		
		int temp = theQueue.remove();
		temp = theQueue.remove();
		temp = theQueue.remove();
		
		theQueue.insert(100);
		theQueue.insert(110);
		theQueue.insert(120);
		theQueue.insert(130);
		
		while(!theQueue.isEmpty()) {
			temp = theQueue.remove();
			System.out.print(temp+" ");
		}
		System.out.println("");
	}

}
