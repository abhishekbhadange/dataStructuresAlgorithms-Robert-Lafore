package depthFirstSearch;

public class Graph {

	private final int MAX_VERTICES = 20;
	private Vertex[] verList;
	private int[][] adjMatrix;
	private StackX theStack;
	private int nVertices;
	
	public Graph() {
		verList = new Vertex[MAX_VERTICES];
		adjMatrix = new int[MAX_VERTICES][MAX_VERTICES];
		nVertices = 0;
		theStack = new StackX();
		for(int j = 0; j < MAX_VERTICES; j++)
			for(int k = 0; k < MAX_VERTICES; k++)
				adjMatrix[j][k] = 0;
	}
	public void addVertex(char label) {
		verList[nVertices++] = new Vertex(label);
	}
	public void addEdge(int start, int end) {
		adjMatrix[start][end] = 1;
		adjMatrix[end][start] = 1;
	}
	public void displayVertex(int v) {
		System.out.print(verList[v].label);
	}
	public void dfs() {
		verList[0].wasVisited = true;
		displayVertex(0);
		theStack.push(0);
		while(!theStack.isEmpty()) {
			int v = getAdjVertex(theStack.peek());
			if(v == -1)
				theStack.pop();
			else {
				verList[v].wasVisited = true;
				displayVertex(v);
				theStack.push(v);
			}
		}
		for(int j = 0; j < nVertices; j++)
			verList[j].wasVisited = false;
	}
	public int getAdjVertex(int v) {
		for(int j = 0; j < MAX_VERTICES; j++) {
			if(adjMatrix[v][j] == 1 && verList[j].wasVisited == false)
				return j;
		}
		return -1;
	}
}
