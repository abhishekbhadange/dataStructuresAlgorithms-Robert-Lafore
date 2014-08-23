package minSpanningTree;

public class MSTapp {

	public static void main(String[] args) {
		
		Graph theGraph = new Graph();
		
		theGraph.insertVertex('A');
		theGraph.insertVertex('B');
		theGraph.insertVertex('C');
		theGraph.insertVertex('D');
		theGraph.insertVertex('E');
		
		theGraph.addEdge(0, 1);
		theGraph.addEdge(0, 2);
		theGraph.addEdge(0, 3);
		theGraph.addEdge(0, 4);
		theGraph.addEdge(1, 2);
		theGraph.addEdge(1, 3);
		theGraph.addEdge(1, 4);
		theGraph.addEdge(2, 3);
		theGraph.addEdge(2, 4);
		theGraph.addEdge(3, 4);
		
		System.out.print("Minimum Spanning Tree: ");
		theGraph.mst();
		System.out.println("");
	}
}
