// Java program to print BFS traversal from a given source vertex.
// BFS(int s) traverses vertices reachable from s.

import java.io.*;
import java.util.*;

// This class represents a directed graph using adjacency list
// representation
class GraphBFS {
    private int V;   // No. of vertices
    private LinkedList<Integer> []adj; //Adjacency Lists

    // Constructor
    GraphBFS(int v) {
        V = v;
        adj = new LinkedList[V];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList<>();
    }

    // Function to add an edge into the graph
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // prints BFS traversal from a given source s
    void BFS(int s) {
        boolean[] visited = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();
        visited[s] = true;
        queue.add(s);
        while (!queue.isEmpty())
        {
            s = queue.poll();
            System.out.print(s+" ");
            for (int n : adj[s]) {
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    // Driver method to
    public static void main(String args[]) {
        GraphBFS g = new GraphBFS(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal " +
                "(starting from vertex 2)");

        g.BFS(2);
    }
}