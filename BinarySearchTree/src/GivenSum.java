import java.util.ArrayList;

class GivenSum {

    Node root;

    GivenSum() {
        root = null;
    }

    void inorder() {
        inorderUtil(this.root);
    }

    void inorderUtil(Node node) {
        if (node == null)
            return;

        inorderUtil(node.left);
        System.out.print(node.key + " ");
        inorderUtil(node.right);
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int data) {

        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.key)
            root.left = insertRec(root.left, data);
        else if (data > root.key)
            root.right = insertRec(root.right, data);

        return root;
    }

    ArrayList<Integer> treeToList(Node node, ArrayList<Integer>
            list) {
        // Base Case
        if (node == null)
            return list;

        treeToList(node.left, list);
        list.add(node.key);
        treeToList(node.right, list);

        return list;
    }

    boolean isPairPresent(Node node, int target) {
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = treeToList(node, a1);
        int start = 0, end = a2.size() - 1;
        while (start < end) {
            int sum = a1.get(start) + a2.get(end);
            if (sum == target) {
                System.out.println("\nYES THE SUM IS PRESENT");
                return true;
            }
            if (sum > target) {
                end--;
            }
            if (sum < target) {
                start++;
            }
        }
        System.out.println("NO THE GIVEN SUM IS NOT PRESENT");
        return false;
    }

    public static void main(String[] args) {
        GivenSum tree = new GivenSum();
        /*
                   15
                /     \
              10      20
             / \     /  \
            8  12   16  25    */
        tree.insert(15);
        tree.insert(10);
        tree.insert(20);
        tree.insert(8);
        tree.insert(12);
        tree.insert(16);
        tree.insert(25);
        System.out.println("Given tree : ");
        tree.inorder();
        tree.isPairPresent(tree.root, 33);
    }
}