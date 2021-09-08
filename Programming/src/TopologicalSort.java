import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class TopologicalSort {
    private int V;
    private ArrayList<ArrayList<Integer>> adj;

    TopologicalSort(int v) {
        V = v;
        adj = new ArrayList<ArrayList<Integer>>(v);
        for (int i = 0; i < v; ++i)
            adj.add(new ArrayList<Integer>());
    }

    void addEdge(int v, int w) {
        adj.get(v).add(w);
    }


    private void topologicalSort() {
        Stack<Integer> s = new Stack<>();
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++)
            if (!visited[i])
                topologicalSortUtil(i, visited, s);
        while (!s.isEmpty())
            System.out.print(s.pop() + " ");
    }

    private void topologicalSortUtil(int v, boolean[] visited, Stack<Integer> s) {
        visited[v] = true;
        Integer i;
        for (Integer integer : adj.get(v)) {
            i = integer;
            if (!visited[i])
                topologicalSortUtil(i, visited, s);
        }
        s.push(v);
    }

    public static void main(String args[]) {
        TopologicalSort g = new TopologicalSort(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);

        System.out.println(
                "Following is a Topological " +
                        "sort of the given graph");
        g.topologicalSort();
    }
}
