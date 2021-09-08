public class LevelOrder1 {
    Node root;

    public LevelOrder1() {
        root = null;
    }


    private void printLevelOrder() {
        for (int i = 1; i <= height(root); i++) {
            printGivenlevel(root, i);
        }
    }

    private void printGivenlevel(Node root, int i) {
        if (root == null)
            return;
        if (i == 1)
            System.out.println(root.key);
        else {
            printGivenlevel(root.left, i - 1);
            printGivenlevel(root.right, i - 1);
        }
    }

    int height(Node root) {
        if (root == null)
            return 0;
        else {
            int lh = height(root.left);
            int rh = height(root.right);
            if (lh > rh) {
                return lh + 1;
            } else {
                return rh + 1;
            }
        }
    }

    public static void main(String args[]) {
        LevelOrder1 tree = new LevelOrder1();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Level order traversal of binary tree is : ");
        tree.printLevelOrder();
    }
}