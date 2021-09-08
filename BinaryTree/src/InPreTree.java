class NodeC {
    char data;
    NodeC left, right;

    NodeC(char item) {
        left = right = null;
        data = item;
    }
}

public class InPreTree {
    NodeC root;
    static int PreIndex = 0;


    private NodeC buildTree(char[] in, char[] pre, int l, int r) {
        if (l > r) {
            return null;
        }
        NodeC tNode = new NodeC(pre[PreIndex++]);
        if (l==r)
            return tNode;
        int inIndex = search(in, l, r, tNode.data);
        tNode.left = buildTree(in, pre, l, inIndex - 1);
        tNode.right = buildTree(in, pre, inIndex + 1, r);
        return tNode;
    }

    private int search(char[] in, int l, int r, char data) {
        int i;
        for (i = l; i <= r; i++) {
            if (in[i] == data)
                return i;
        }
        return i;
    }

    void printInorder(NodeC node) {
        if (node == null)
            return;
        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }

    public static void main(String[] args) {
        InPreTree tree = new InPreTree();
        char[] in = new char[]{'D', 'B', 'E', 'A', 'F', 'C'};
        char[] pre = new char[]{'A', 'B', 'D', 'E', 'C', 'F'};
        int len = in.length;
        NodeC root = tree.buildTree(in, pre, 0, len - 1);
        System.out.println("Inorder traversal of constructed tree is : ");
        tree.printInorder(root);
    }
}
