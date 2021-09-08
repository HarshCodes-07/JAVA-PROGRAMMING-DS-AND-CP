import java.util.Iterator;
import java.util.LinkedList;

public class DFS {
    private int V;
    private LinkedList<Integer> adj[];

    DFS(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int u, int v) {
        adj[u].add(v);
    }

    void DFS_Traversal(int v) {
        boolean[] visited = new boolean[V];
        DFS_Util(v, visited);
    }

    private void DFS_Util(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n]) {
                DFS_Util(n, visited);
            }
        }
    }

    public static void main(String args[]) {
        DFS g = new DFS(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal " +
                "(starting from vertex 2)");

        g.DFS_Traversal(2);
    }
}
