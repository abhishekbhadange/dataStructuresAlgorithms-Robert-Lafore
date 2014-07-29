package quickSort3;

public class QuickSort3App {

	public static void main(String args[]) {
		
		int maxSize = 16;
		ArrayIns arr = new ArrayIns(maxSize);
		
		for(int i=0; i<maxSize; i++) {
			int n = (int)(java.lang.Math.random()*99);
			arr.insert(n);
		}
		arr.display();
		arr.quickSort();
		arr.display();
	}
}
