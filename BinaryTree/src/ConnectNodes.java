import java.util.LinkedList;
import java.util.Queue;

public class ConnectNodes {
    Node root;

    void connect(Node p) {
        Queue<Node> q = new LinkedList<>();
        q.add(p);
        Node temp = null;
        while (!q.isEmpty()) {
            int n = q.size();
            for (int i = 0; i < n; i++) {
                Node prev = temp;
                temp = q.poll();
                if (i > 0)
                    prev.nextRight = temp;
                if (temp.left != null)
                    q.add(temp.left);
                if (temp.right != null)
                    q.add(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        ConnectNodes tree = new ConnectNodes();

        /* Constructed binary tree is
             10
            /  \
          8     2
         /
        3
        */
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);

        tree.connect(tree.root);

        System.out.println("Following are populated nextRight pointers in "
                + "the tree"
                + "(-1 is printed if there is no nextRight)");
        int a = tree.root.nextRight != null ? tree.root.nextRight.key : -1;
        System.out.println("nextRight of " + tree.root.key + " is "
                + a);
        int b = tree.root.left.nextRight != null ? tree.root.left.nextRight.key : -1;
        System.out.println("nextRight of " + tree.root.left.key + " is "
                + b);
        int c = tree.root.right.nextRight != null ? tree.root.right.nextRight.key : -1;
        System.out.println("nextRight of " + tree.root.right.key + " is "
                + c);
        int d = tree.root.left.left.nextRight != null ? tree.root.left.left.nextRight.key : -1;
        System.out.println("nextRight of " + tree.root.left.left.key + " is "
                + d);
    }
}
