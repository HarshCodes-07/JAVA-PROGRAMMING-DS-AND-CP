import java.util.Stack;

class InorderStack {
    Node root;

    void inorder() {
        if (root == null)
            return;
        Stack<Node> s = new Stack<>();
        Node curr = root;
        while (curr != null || !s.isEmpty()) {
            while (curr != null) {
                s.push(curr);
                curr = curr.left;
            }
            Node currTop = s.pop();
            System.out.print(currTop.key + " ");
            curr = currTop.right;
        }
    }

    public static void main(String args[]) {
        InorderStack tree = new InorderStack();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.inorder();
    }
}
