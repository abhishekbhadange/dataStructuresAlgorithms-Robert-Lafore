package PriorityQ;

public class priorityQ {

	private int qSize;
	private double[] qArray;
	private int nitems;
	
	public priorityQ(int size) {
		qSize = size;
		qArray = new double[qSize];
		nitems = 0;
	}
	public void insert(double item) {
		int j;
		if(nitems == 0) {
			qArray[nitems++] = item;
		}
		else {
			for(j = nitems - 1; j >= 0; j--) {
				if(item > qArray[j])
					qArray[j+1] = qArray[j];
				else
					break;
			}
			qArray[j+1] = item;
			nitems++;
		}
	}
	public double remove() {
		return qArray[--nitems];
	}
	public double peekMin() {
		return qArray[nitems-1];
	}
	public boolean isEmpty() {
		return (nitems == 0);
	}
	public boolean isFull() {
		return (nitems == qSize);
	}
}
