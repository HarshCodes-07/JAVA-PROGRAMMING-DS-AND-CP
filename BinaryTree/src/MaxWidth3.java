public class MaxWidth3 {
    Node root;

    /* Function to get the maximum width of a binary tree*/
    int getMaxWidth(Node node) {
        int n = height(node);
        int[] count = new int[10];
        int level = 0;
        getMaxWidthRecur(node, count, level);
        return getMax(count, n);
    }

    void getMaxWidthRecur(Node node, int[] count, int level) {
        if (node != null) {
            count[level]++;
            getMaxWidthRecur(node.left, count, level + 1);
            getMaxWidthRecur(node.right, count, level + 1);
        }
    }

    int height(Node node) {
        if (node == null)
            return 0;
        else {
            int lHeight = height(node.left);
            int rHeight = height(node.right);

            return (lHeight > rHeight) ? (lHeight + 1)
                    : (rHeight + 1);
        }
    }

    int getMax(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(arr[i], max);
        }
        return max;
    }

    public static void main(String args[]) {
        MaxWidth3 tree = new MaxWidth3();

        /*
        Constructed bunary tree is:
              1
            /  \
           2    3
          / \    \
         4   5    8
                 / \
                6   7 */
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(8);
        tree.root.right.right.left = new Node(6);
        tree.root.right.right.right = new Node(7);
        System.out.println("Maximum width is "
                + tree.getMaxWidth(tree.root));
    }
}
