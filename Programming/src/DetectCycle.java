import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DetectCycle {
    private final int V;
    private final List<List<Integer>> adj;

    private DetectCycle(int v) {
        V = v;
        adj = new ArrayList<>();
        for (int i = 0; i < V; i++)
            adj.add(new LinkedList<>());
    }

    private void addEdge(int source, int dest) {
        adj.get(source).add(dest);
    }

    private boolean isCyclicUtil(int i, boolean[] visited, boolean[] recStack) {
        if (recStack[i]) {
            return true;
        }
        if (visited[i])
            return false;
        visited[i] = true;
        recStack[i] = true;
        List<Integer> children = adj.get(i);
        for (Integer c : children) {
            if (isCyclicUtil(c, visited, recStack))
                return true;
        }
        return false;
    }

    private boolean isCyclic() {
        boolean[] visited = new boolean[V];
        boolean[] recStack = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (isCyclicUtil(i, visited, recStack))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        DetectCycle graph = new DetectCycle(4);
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
