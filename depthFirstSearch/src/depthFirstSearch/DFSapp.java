package depthFirstSearch;

public class DFSapp {

	public static void main(String[] args) {
	
		Graph theGraph = new Graph();
	
		theGraph.addVertex('A');
		theGraph.addVertex('B');
		theGraph.addVertex('F');
		theGraph.addVertex('H');
		theGraph.addVertex('C');
		theGraph.addVertex('D');
		theGraph.addVertex('G');
		theGraph.addVertex('I');
		theGraph.addVertex('E');
		
		theGraph.addEdge(0,1);
		theGraph.addEdge(1,2);
		theGraph.addEdge(2,3);
		theGraph.addEdge(0,4);
		theGraph.addEdge(0,5);
		theGraph.addEdge(5,6);
		theGraph.addEdge(6,7);
		theGraph.addEdge(0,8);
		
		System.out.print("DFS Traversal: ");
		theGraph.dfs();
		System.out.println("");
	}
}
