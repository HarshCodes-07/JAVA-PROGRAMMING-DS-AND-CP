import java.util.LinkedList;
import java.util.Queue;

public class MaxWidth2 {

    static int maxwidth(Node root) {
        if (root == null)
            return 0;
        int maxWidth = 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int count = queue.size();
            maxWidth = Math.max(maxWidth, count);
            while (count-- > 0) {
                Node temp = queue.remove();
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null)
                    queue.add(temp.right);
            }
        }
        return maxWidth;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(8);
        root.right.right.left = new Node(6);
        root.right.right.right = new Node(7);
  
        /*   Constructed Binary tree is:
        1
      /   \
    2      3
  /  \      \
 4    5      8
           /   \
          6     7    */

        // Function call
        System.out.println("Maximum width = "
                + maxwidth(root));
    }
}