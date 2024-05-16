import java.util.Scanner;
import java.util.LinkedList;

class Graph {
    private int vertices;
    private LinkedList<Integer>[] adjList;
    Graph(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) adjList[i] = new LinkedList<>(); 
    }

    public void addEdge(int source, int destination) {
        adjList[source].add(destination);
    }

    public void readGraph() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of edges: ");
        int edges = sc.nextInt();
        System.out.println("Enter edges (source destination):");
        for (int i = 0; i < edges; i++) {
            int source = sc.nextInt();
            int destination = sc.nextInt();
            addEdge(source, destination);
        }
        sc.close();
    }

    private void dfsUtil(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (int neighbor : adjList[vertex]) 
            if (!visited[neighbor]) dfsUtil(neighbor, visited);  
    }

    public void dfs() {
        boolean[] visited = new boolean[numVertices];
        System.out.println("Depth First Traversal:");
        for (int i = 0; i < vertices; i++) 
            if (!visited[i]) dfsUtil(i, visited);
        System.out.println();
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of vertices: ");
        int vertices = sc.nextInt();
        Graph graph = new Graph(vertices);
        graph.readGraph();
        graph.dfs();
        sc.close();
    }
}
