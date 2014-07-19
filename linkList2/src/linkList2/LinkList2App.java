package linkList2;

public class LinkList2App {

	public static void main(String args[]) {
		
		LinkList2 theList = new LinkList2();
		
		theList.insertFirst(22, 2.99);
		theList.insertFirst(44, 4.99);
		theList.insertFirst(66, 6.99);
		theList.insertFirst(88, 8.99);
		
		theList.displayList();
		
		Link temp1 = theList.find(44);
		if(temp1 != null)
			System.out.println("Found link with key: " + temp1.iData);
		else
			System.out.println("Can't find key: " + temp1.iData);
		
		Link temp2 = theList.delete(66);
		if(temp2 != null)
			System.out.println("Deleted link with key: " + temp2.iData);
		else
			System.out.println("Can't delete key: " + temp2.iData);
		
		theList.displayList();
	}
}
