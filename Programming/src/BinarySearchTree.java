public class BinarySearchTree {
    static Node head;

    Node insert(Node node, int data) {
        if (node == null)
            return (new Node(data));
        else {
            if (data <= node.data)
               node.left = insert(node.left, data);
            else
                node.right = insert(node.right, data);
        }
        return node;
    }

    int minvalue(Node node) {
        Node current = node;
        while (current.left != null)
            current = current.left;
        return current.data;
    }

    int maxvalue(Node node) {
        Node current = node;
        while (current.right != null)
            current = current.right;
        return current.data;
    }

    boolean isBST(Node node) {
        return isBSTUtil(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBSTUtil(Node node, int minValue, int maxValue) {
        if (node == null)
            return true;
        if (node.data < minValue || node.data > maxValue)
            return false;
        return (isBSTUtil(node.left, minValue, node.data - 1)&&
        isBSTUtil(node.right, node.data + 1, maxValue));
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        Node root = null;
        root = tree.insert(root, 4);
        tree.insert(root, 2);
        tree.insert(root, 1);
        tree.insert(root, 3);
        tree.insert(root, 6);
        tree.insert(root, 5);

        System.out.println("Minimum value of BST is " + tree.minvalue(root));
        System.out.println("Maximum value of BST is " + tree.maxvalue(root));
        System.out.println("Is it a BST : " + tree.isBST(root));
    }
}
