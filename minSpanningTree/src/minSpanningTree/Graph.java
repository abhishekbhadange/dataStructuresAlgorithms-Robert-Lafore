package minSpanningTree;

public class Graph {

	private final int SIZE = 20;
	private Vertex[] vertexList;
	private int[][] adjMatrix;
	private int nVert;
	private StackX theStack;
	
	public Graph() {
		vertexList = new Vertex[SIZE];
		adjMatrix = new int[SIZE][SIZE];
		nVert = 0;
		theStack = new StackX();
		for(int i = 0; i < SIZE; i++)
			for(int j = 0; j < SIZE; j++)
				adjMatrix[i][j] = 0;
	}
	public void insertVertex(char label) {
		vertexList[nVert++] = new Vertex(label);
	}
	public void addEdge(int start, int end) {
		adjMatrix[start][end] = 1;
		adjMatrix[end][start] = 1;
	}
	public void displayVertex(int v) {
		System.out.print(vertexList[v].label);
	}
	public void mst() {
		int currentIndex, v;
		vertexList[0].wasVisited = true;
		theStack.push(0);
		while(!theStack.isEmpty()) {
			currentIndex = theStack.peek();
			v = getAdjUnvisitedVertex(currentIndex);
			if(v == -1)
				theStack.pop();
			else {
				vertexList[v].wasVisited = true;
				theStack.push(v);
				displayVertex(currentIndex);
				displayVertex(v);
				System.out.print(" ");
			}
		}
		for(int j = 0; j < nVert; j++)
			vertexList[j].wasVisited = false;
	}
	public int getAdjUnvisitedVertex(int v) {
		for(int j = 0; j < nVert; j++)
			if(adjMatrix[v][j] == 1 && vertexList[j].wasVisited == false)
				return j;
		return -1;
	}
}
