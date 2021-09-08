class Diameter {
    Node root;

    int diameter(Node root) {
        if (root == null)
            return 0;
        int lh = height(root.left);
        int rh = height(root.right);

        int dl = diameter(root.left);
        int dr = diameter(root.right);
        return Math.max((lh + rh + 1), Math.max(dl, dr));
    }

    int diameter() {
        return diameter(root);
    }

    static int height(Node node) {
        if (node == null)
            return 0;
        return (1
                + Math.max(height(node.left),
                height(node.right)));
    }

    public static void main(String[] args) {
        Diameter tree = new Diameter();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println(
                "The diameter of given binary tree is : "
                        + tree.diameter());
    }
}
