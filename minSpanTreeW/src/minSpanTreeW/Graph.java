package minSpanTreeW;

public class Graph {

	private final int MAX_VERTS = 20;
	private final int INFINITY = 1000000;
	private Vertex[] vertexList;
	private int[][] adjMatrix;
	private int nItems;
	private int nTree;
	private int currentVertex;
	private PriorityQ thePQ;
	
	public Graph() {
		vertexList = new Vertex[MAX_VERTS];
		adjMatrix = new int[MAX_VERTS][MAX_VERTS];
		nItems = 0;
		for(int j = 0; j < MAX_VERTS; j++)
			for(int k = 0; k < MAX_VERTS; k++)
				adjMatrix[j][k] = INFINITY;
		thePQ = new PriorityQ();
	}
	public void addVertex(char lab) {
		vertexList[nItems++] = new Vertex(lab);
	}
	public void addEdge(int start, int end, int weight) {
		adjMatrix[start][end] = weight;
		adjMatrix[end][start] = weight;
	}
	public void displayVertex(int index) {
		System.out.print(vertexList[index].label);
	}
	public void mstw() {
		currentVertex = 0;
		while(nTree < nItems - 1) {
			
			vertexList[currentVertex].isInTree = true;
			nTree++;
			
			for(int j = 0; j < nItems; j++) {
				if(j == currentVertex)
					continue;
				if(vertexList[j].isInTree)
					continue;
				int dist = adjMatrix[currentVertex][j];
				if(dist == INFINITY)
					continue;
				putInPQ(j, dist);
			}
			if(thePQ.isEmpty()){
				System.out.println("Graph not connected!");
				return;
			}
			Edge tempEdge = thePQ.removeMin();
			int srcVertex = tempEdge.srcVertex;
			currentVertex = tempEdge.dstVertex;
			
			System.out.print(vertexList[srcVertex].label);
			System.out.print(vertexList[currentVertex].label);
			System.out.print(" ");
		}
		for(int j = 0; j < nItems; j++)
			vertexList[j].isInTree = true;
	}
	public void putInPQ(int newDstVertex, int newDist) {
		int index = thePQ.find(newDstVertex);
		if(index != -1) {
			Edge temp = thePQ.peekN(index);
			int oldDist = temp.distance;
			if(oldDist > newDist) {
				thePQ.removeN(index);
				Edge newEdge = new Edge(currentVertex, newDstVertex, newDist);
				thePQ.insert(newEdge);
			}
		}
		else {
			Edge newEdge = new Edge(currentVertex, newDstVertex, newDist);
			thePQ.insert(newEdge);
		}
	}
}
