package partition;

public class PartitionApp {
	
	public static void main(String args[]) {
		
		int maxSize = 16;
		ArrayPart arr = new ArrayPart(maxSize);
		
		for(int i = 0; i < maxSize; i++) {
			int n = (int)(java.lang.Math.random()*199);
			arr.insert(n);
		}
		arr.display();
		
		int pivot = 99;
		System.out.print("Pivot is " + pivot + " ");
		
		int partIndex = arr.partitionIt(0, arr.size() - 1, pivot);
		System.out.print(", Partition is at index " + partIndex + "\n");
		arr.display();
	}

}
