public class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }

    public static void main(String[] args) {
//        Node x = new Node(1);
//        x.next = new Node(2);
//        x.random=
//        x.next.next = new Node(3);
//        x.next.next.next = new Node(4);
//        x.next.next.next.next = new Node(5);
////        x.next.next.next.next.next = new ListNode(9);
////        x.next.next.next.next.next.next = new ListNode(9);
//        System.out.println("Orignal List are : ");
//        printList(x);
//        printList(x);
    }
    private static void printList(ListNode x) {
        ListNode temp = x;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
