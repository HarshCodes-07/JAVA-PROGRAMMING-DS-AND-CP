// A Java Program to detect cycle in a graph

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class DetectCycleDirected {

    private final int V;
    private final List<List<Integer>> adj;

    public DetectCycleDirected(int V) {
        this.V = V;
        adj = new ArrayList<>(V);

        for (int i = 0; i < V; i++)
            adj.add(new LinkedList<>());
    }

    private boolean isCyclicUtil(int i, boolean[] visited,
                                 boolean[] recStack) {
        if (recStack[i]) {
            return true;
        }
        if (visited[i]) {
            return false;
        }
        recStack[i] = true;
        visited[i] = true;
        List<Integer> childer = adj.get(i);
        for (Integer c : childer) {
            if (recStack[c]) {
                return true;
            }
        }
        recStack[i] = false;
        return false;
    }

    private void addEdge(int source, int dest) {
        adj.get(source).add(dest);
    }

    private boolean isCyclic() {
        boolean[] visited = new boolean[V];
        boolean[] recStack = new boolean[V];
        for (int i = 0; i < V; i++)
            if (isCyclicUtil(i, visited, recStack))
                return true;
        return false;
    }

    // Driver code
    public static void main(String[] args) {
        DetectCycleDirected graph = new DetectCycleDirected(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        if (graph.isCyclic())
            System.out.println("Graph contains cycle");
        else
            System.out.println("Graph doesn't "
                    + "contain cycle");
    }
}

// This code is contributed by Sagar Shah.
