public class InorderSuccessor {
    static class node {
        int data;
        node left;
        node right;
        node parent;
    }

    static node inOrderSuccessor(
            node root,
            node n) {
        if (n.right != null) {
            return minValue(n);
        }
        node successor = null;
        while (root != null) {
            if (n.data < root.data) {
                successor = root;
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return successor;
    }

    static node minValue(node node) {
        node curr = node.right;
        while (curr.left != null) {
            curr = curr.left;
        }
        return curr;
    }

    static node newNode(int data) {
        node node = new node();
        node.data = data;
        node.left = null;
        node.right = null;
        node.parent = null;

        return (node);
    }

    static node insert(node node,
                       int data) {
        if (node == null)
            return (newNode(data));
        else {
            node temp;
            if (data <= node.data) {
                temp = insert(node.left, data);
                node.left = temp;
                temp.parent = node;
            } else {
                temp = insert(node.right, data);
                node.right = temp;
                temp.parent = node;
            }
            return node;
        }
    }

    public static void main(String[] args) {
        node root = null, temp, succ, min;
        root = insert(root, 20);
        root = insert(root, 8);
        root = insert(root, 22);
        root = insert(root, 4);
        root = insert(root, 12);
        root = insert(root, 10);
        root = insert(root, 14);
        temp = root.left.right.right;
        succ = inOrderSuccessor(root, temp);
        if (succ != null)
            System.out.printf(
                    "\n Inorder Successor of %d is %d ",
                    temp.data, succ.data);
        else
            System.out.print("\n Inorder Successor doesn't exit");
    }
}
