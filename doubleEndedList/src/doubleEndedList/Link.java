package doubleEndedList;

public class Link {

	public int iData;
	public Link next;
	
	public Link(int d) {
		iData = d;
	}
	public void displayLink() {
		System.out.print(iData + " ");
	}
}
