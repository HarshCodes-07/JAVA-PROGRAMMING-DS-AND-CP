class SplitCLL {

    static Node head, head1, head2;

    static class Node {

        int data;
        Node next, prev;

        Node(int d) {
            data = d;
            next = prev = null;
        }
    }

    /* Function to split a list (starting with head) into two lists.
     head1_ref and head2_ref are references to head nodes of 
     the two resultant linked lists */
    void splitList() {
        Node slow = head;
        Node fast = head;
        if (head == null)
            return;
        while (fast.next != head && fast.next.next != head) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast.next.next == head)
            fast = fast.next;
        head1 = head;
        if (head.next != head)
            head2 = slow.next;
        fast.next = head2;
        slow.next = head1;
    }

    /* Function to print nodes in a given singly linked list */
    void printList(Node node) {
        Node temp = node;
        if (node != null) {
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != node);
        }
    }

    public static void main(String[] args) {
        SplitCLL list = new SplitCLL();

        //Created linked list will be 12->56->2->11
        list.head = new Node(12);
        list.head.next = new Node(56);
        list.head.next.next = new Node(2);
        list.head.next.next.next = new Node(11);
        list.head.next.next.next.next = list.head;

        System.out.println("Original Circular Linked list ");
        list.printList(head);

        // Split the list
        list.splitList();
        System.out.println("");
        System.out.println("First Circular List ");
        list.printList(head1);
        System.out.println("");
        System.out.println("Second Circular List ");
        list.printList(head2);

    }
}
  