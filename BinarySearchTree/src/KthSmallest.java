public class KthSmallest {
    static int count = 0;

    public static Node insert(Node root, int x) {
        if (root == null)
            return new Node(x);
        if (x < root.key)
            root.left = insert(root.left, x);
        else if (x > root.key)
            root.right = insert(root.right, x);
        return root;
    }

    public static Node kthSmallest(Node root, int k) {
        if (root == null)
            return null;
        Node left = kthSmallest(root.left, k);
        if (left != null) {
            return left;
        }
        count++;
        if (count == k) return root;
        return kthSmallest(root.right, k);
    }

    public static void printKthSmallest(Node root, int k) {
        count = 0;

        Node res = kthSmallest(root, k);
        if (res == null)
            System.out.println("There are less "
                    + "than k nodes in the BST");
        else
            System.out.println("K-th Smallest"
                    + " Element is " + res.key);
    }

    public static void main(String[] args) {
        Node root = null;
        int[] keys = {20, 8, 22, 4, 12, 10, 14};

        for (int x : keys)
            root = insert(root, x);

        int k = 3;
        printKthSmallest(root, k);
    }
}
