public class Ceil {
    Node root;

    // Function to find ceil of a given input in BST.
    // If input is more than the max key in BST,
    // return -1
    int Ceil(Node node, int input) {
        if (node == null)
            return -1;
        if (node.key == input)
            return node.key;
        if (node.key < input) {
            return Ceil(node.right, input);
        }
        int ceil = Ceil(node.left, input);
        return (ceil >= input) ? ceil : node.key;
    }

    // Driver Code
    public static void main(String[] args) {
        Ceil tree = new Ceil();
        tree.root = new Node(8);
        tree.root.left = new Node(4);
        tree.root.right = new Node(12);
        tree.root.left.left = new Node(2);
        tree.root.left.right = new Node(6);
        tree.root.right.left = new Node(10);
        tree.root.right.right = new Node(14);
        for (int i = 0; i < 16; i++) {
            System.out.println(i + " " + tree.Ceil(tree.root, i));
        }
    }
}
