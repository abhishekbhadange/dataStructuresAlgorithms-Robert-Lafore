package topologicalSort;

public class Graph {

	private Vertex[] verList;
	private int[][] adjMatrix;
	private final int MAX_VERTS = 20;
	private int nVerts;
	private char[] sortedArray;
	
	public Graph() {
		verList = new Vertex[MAX_VERTS];
		adjMatrix = new int[MAX_VERTS][MAX_VERTS];
		nVerts = 0;
		sortedArray = new char[MAX_VERTS];
		for(int j = 0; j < MAX_VERTS; j++)
			for(int k = 0; k < MAX_VERTS; k++)
				adjMatrix[j][k] = 0;
	}
	public void addVertex(char label) {
		verList[nVerts++] = new Vertex(label);
	}
	public void addEdge(int start, int end) {
		adjMatrix[start][end] = 1;
	}
	public void displayVertex(int v) {
		System.out.print(verList[v].label);
	}
	public void topo() {
		int currentVertex;
		int orig_verts = nVerts;
		while(nVerts > 0) {
			currentVertex = noSuccessors();
			if(currentVertex == -1){
				System.out.println("ERROR: The graph has a cycle!");
				return;
			}
			sortedArray[nVerts - 1] = verList[currentVertex].label;
			deleteVertex(currentVertex);
		}
		System.out.print("Topological Sorting order: ");
		for(int j = 0; j < orig_verts; j++)
			System.out.print(sortedArray[j]);
		System.out.println("");
	}
	public int noSuccessors() {
		boolean isEdge;
		for(int row = 0; row < nVerts; row++) {
			isEdge = false;
			for(int col = 0; col < nVerts; col++) {
				if(adjMatrix[row][col] > 0) {
					isEdge = true;
					break;
				}
			}
			if(!isEdge)
				return row;
		}
		return -1;
	}
	public void deleteVertex(int delVertex) {
		if(delVertex != nVerts - 1) {
			for(int j = delVertex; j < nVerts - 1; j++)
				verList[j] = verList[j+1];
			for(int row = delVertex; row < nVerts - 1; row++)
				moveRowUp(row, nVerts);
			for(int col = delVertex; col < nVerts - 1; col++)
				moveColLeft(col, nVerts - 1);
		}
		nVerts--;
	}
	public void moveRowUp(int row, int length) {
		for(int col = 0; col < length; col++)
			adjMatrix[row][col] = adjMatrix[row+1][col];
	}
	public void moveColLeft(int col, int length) {
		for(int row = 0; row < length; row++)
			adjMatrix[row][col] = adjMatrix[row][col+1];
	}
}
