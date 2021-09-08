class Node {
    int key;
    Node left, right,nextRight;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

public class Traversals {
    Node root;

    Traversals() {
        root = null;
    }


    private void preOrder() {
        printPreOrder(root);
        System.out.println();
    }

    private void printPreOrder(Node node) {
        if (node == null)
            return;
        System.out.print(node.key + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }

    private void postOrder() {
        printPostOrder(root);
        System.out.println();
    }

    private void printPostOrder(Node node) {
        if (node == null) {
            return;
        }
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.key + " ");
    }

    private void inOrder() {
        printInOrder(root);
        System.out.println();
    }

    private void printInOrder(Node node) {
        if (node == null) {
            return;
        }
        printInOrder(node.left);
        System.out.print(node.key + " ");
        printInOrder(node.right);
    }

    public static void main(String[] args) {
        Traversals tree = new Traversals();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println("PREORDER TRAVERSAL OF THE BINARY TREE : ");
        tree.preOrder();
        System.out.println("INORDER TRAVERSAL OF THE BINARY TREE : ");
        tree.inOrder();
        System.out.println("POSTORDER TRAVERSAL OF THE BINARY TREE : ");
        tree.postOrder();

    }
}