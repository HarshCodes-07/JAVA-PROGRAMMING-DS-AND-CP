import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder2 {
    Node root;

    public LevelOrder2() {
        root = null;
    }


     private void printLevelOrder() {
        if (root == null)
            return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            System.out.print(node.key + " ");
            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.right);
        }
    }

    public static void main(String args[]) {
        LevelOrder2 tree = new LevelOrder2();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Level order traversal of binary tree is : ");
        tree.printLevelOrder();
    }
}