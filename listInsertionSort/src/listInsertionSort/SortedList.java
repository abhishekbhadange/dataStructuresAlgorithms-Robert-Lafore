package listInsertionSort;

public class SortedList {

	private Link first;
	
	public SortedList() {
		first = null;
	}
	public SortedList(Link[] linkArr) {
		first = null;
		for(int j = 0; j < linkArr.length; j++) 
			insert(linkArr[j]);
	}
	public void insert(Link k) {
		Link current = first;
		Link previous = null;
		while(current != null && k.iData > current.iData) {
			previous = current;
			current = current.next;
		}
		if(previous == null)
			first = k;
		else
			previous.next = k;
		k.next = current;
	}
	public Link remove() {		// assumes non-empty list
		Link temp = first;
		first = first.next;
		return temp;
	}
}
