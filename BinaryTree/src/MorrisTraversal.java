class MorrisTraversal {
    Node root;

    void MorrisTraversal(Node root) {
        Node current = root, pre;
        if (root == null)
            return;
        while (current != null) {
            if (current.left == null) {
                System.out.print(current.key + " ");
                current = current.right;
            } else {
                pre = current.left;
                while (pre.right != null && pre.right != current) {
                    pre = pre.right;
                }
                if (pre.right != null) {
                    System.out.print(current.key + " ");
                    current = current.right;
                    pre.right = null;
                } else {
                    pre.right = current;
                    current = current.left;
                }
            }
        }
    }

    public static void main(String args[]) {
        /* Constructed binary tree is
               1
             /   \
            2      3
          /   \
         4     5
        */
        MorrisTraversal tree = new MorrisTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        tree.MorrisTraversal(tree.root);
    }
}
 