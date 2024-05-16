package Q10;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class Graph {
    private int vertices;
    private LinkedList<Integer>[] adjList;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        for (int i = 0; i < numVertices; i++) adjList[i] = new LinkedList<>();
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

    public void bfs(int startVertex) {
        boolean[] visited = new boolean[numVertices];
        Queue<Integer> queue = new ArrayDeque<>();
        visited[startVertex] = true;
        queue.add(startVertex);

        System.out.println("Breadth First Traversal:");

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            for (int neighbor : adjList[vertex]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of vertices: ");
        int vertices = sc.nextInt();
        Graph graph = new Graph(vertices);
        graph.readGraph();

        System.out.print("Enter the starting vertex for BFS traversal: ");
        int startVertex = sc.nextInt();
        graph.bfs(startVertex);

        sc.close();
    }
}
