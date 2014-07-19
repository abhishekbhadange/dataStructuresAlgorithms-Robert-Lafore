package linkList2;

public class Link {

	public int iData;
	public double dData;
	public Link next;
	
	public Link(int iD, double dD) {
		iData = iD;
		dData = dD;
	}
	public void displayLink() {
		System.out.print("{" + iData + ", " + dData + "} ");
	}
}
