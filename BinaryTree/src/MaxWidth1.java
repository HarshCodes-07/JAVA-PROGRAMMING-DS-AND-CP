public class MaxWidth1 {
    Node root;

    int getMaxWidth(Node node) {
        int MaxWidth = 0;
        int width = 0;
        for (int i = 0; i < height(node); i++) {
            width = getWidth(node, i);
            MaxWidth = Math.max(width, MaxWidth);
        }
        return MaxWidth;
    }

    int getWidth(Node node, int level) {
        if (node == null)
            return 0;
        else if (level == 1) {
            return 1;
        } else {
            return getWidth(node.left, level - 1) + getWidth(node.right, level - 1);
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

    public static void main(String args[]) {
        MaxWidth1 tree = new MaxWidth1();

        /*
        Constructed binary tree is:
              1
            /  \
           2    3
         /  \    \
        4   5     8
                 /  \
                6   7
         */
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
