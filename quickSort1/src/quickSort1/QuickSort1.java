package quickSort1;

public class QuickSort1 {

	public static void main(String args[]) {
		
		int maxSize = 16;
		ArrayIns theArray = new ArrayIns(maxSize);
		
		for(int i = 0; i < maxSize; i++) {
			int n = (int)(java.lang.Math.random()*99);
			theArray.insert(n);
		}
		theArray.display();
		theArray.quickSort();
		theArray.display();
	}
}
