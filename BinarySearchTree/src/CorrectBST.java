public class CorrectBST {
    Node first, middle, last, prev;

    void correctBSTUtil(Node root) {
        if (root != null) {
            correctBSTUtil(root.left);
            if (prev != null && root.key < prev.key) {
                if (first == null) {
                    first = prev;
                    middle = root;
                } else {
                    last = root;
                    return;
                }
            }
            prev = root;
            correctBSTUtil(root.right);
        }
    }

        void correctBST (Node root){
            first = middle = last = prev = null;
            correctBSTUtil(root);
            if (first != null && last != null) {
                int temp = last.key;
                last.key = first.key;
                first.key = temp;
            } else if (first != null && middle != null) {
                int temp = middle.key;
                middle.key = first.key;
                first.key = temp;
            }
        }

        void printInorder (Node node){
            if (node == null)
                return;
            printInorder(node.left);
            System.out.print(" " + node.key);
            printInorder(node.right);
        }


        public static void main (String[]args){
        /*   6
            / \
           10  2
          / \ / \
         1  3 7 12

        10 and 2 are swapped
        */

            Node root = new Node(6);
            root.left = new Node(10);
            root.right = new Node(2);
            root.left.left = new Node(1);
            root.left.right = new Node(3);
            root.right.right = new Node(12);
            root.right.left = new Node(7);

            System.out.println("Inorder Traversal" +
                    " of the original tree");
            CorrectBST tree = new CorrectBST();
            tree.printInorder(root);
            tree.correctBST(root);
            System.out.println("\nInorder Traversal" +
                    " of the fixed tree");
            tree.printInorder(root);
        }
    }
