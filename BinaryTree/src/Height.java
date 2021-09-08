class Height {
    Node root;

    int maxDepth(Node node) {
        if (node == null)
            return -1;
        else {
            int lh = maxDepth(node.left);
            int rh = maxDepth(node.right);
            if (lh > rh)
                return lh + 1;
            else
                return rh + 1;
        }
    }

    public static void main(String[] args) {
        Height tree = new Height();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Height of tree is : " +
                tree.maxDepth(tree.root));
    }
}

