import java.util.HashMap;
import java.util.HashSet;

public class InPreTree1 {

    NodeC root;
    static int PreIndex = 0;
    static HashMap<Character, Integer> mp = new HashMap<>();

    private static NodeC buildTree(char[] in, char[] pre, int l, int r) {
        if (l > r) {
            return null;
        }
        NodeC tNode = new NodeC(pre[PreIndex++]);
        int inIndex = mp.get(tNode.data);
        tNode.left = buildTree(in, pre, l, inIndex - 1);
        tNode.right = buildTree(in, pre, inIndex + 1, r);
        return tNode;
    }

    public static NodeC buildTreeWrap(char[] in, char[] pre, int len) {
        for (int i = 0; i < len; i++) {
            mp.put(in[i], i);
        }
        return buildTree(in, pre, 0, len - 1);
    }

    void printInorder(NodeC node) {
        if (node == null)
            return;
        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }

    public static void main(String[] args) {
        InPreTree1 tree = new InPreTree1();
        char[] in = new char[]{'D', 'B', 'E', 'A', 'F', 'C'};
        char[] pre = new char[]{'A', 'B', 'D', 'E', 'C', 'F'};
        int len = in.length;
        NodeC root = buildTreeWrap(in, pre, len);
        System.out.println("Inorder traversal of constructed tree is : ");
        tree.printInorder(root);
    }
}
