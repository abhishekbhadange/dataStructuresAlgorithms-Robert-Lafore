package breadthFirstSearch;

public class Graph {

	private final int MAX_VERT = 20;
	private Vertex[] verList;
	private int[][] adjMatrix;
	private int nVerts;
	private Queue theQueue;
	
	public Graph() {
		verList = new Vertex[MAX_VERT];
		adjMatrix = new int[MAX_VERT][MAX_VERT];
		nVerts = 0;
		theQueue = new Queue();
		for(int j = 0; j < MAX_VERT; j++)
			for(int k = 0; k < MAX_VERT; k++)
				adjMatrix[j][k] = 0;
	}
	public void addVertex(char lab) {
		verList[nVerts++] = new Vertex(lab);
	}
	public void addEdge(int start, int end) {
		adjMatrix[start][end] = 1;
		adjMatrix[end][start] = 1;
	}
	public void displayVertex(int v) {
		System.out.print(verList[v].label);
	}
	public void bfs() {
		verList[0].wasVisited = true;
		displayVertex(0);
		theQueue.insert(0);
		int v2;
		while(!theQueue.isEmpty()) {
			int v1 = theQueue.remove();
			while((v2 = getAdjUnvisitedVertex(v1)) != -1) {
				verList[v2].wasVisited = true;
				displayVertex(v2);
				theQueue.insert(v2);
			}
		}
		for(int j = 0; j < nVerts; j++)
			verList[j].wasVisited = false;
	}
	public int getAdjUnvisitedVertex(int v) {
		for(int j = 0; j < nVerts; j++)
			if(adjMatrix[v][j] == 1 && verList[j].wasVisited == false)
				return j;
		return -1;
	}
}
