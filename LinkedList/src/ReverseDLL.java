class ReverseDLL {

    static Node head;

    static class Node {

        int data;
        Node next, prev;

        Node(int d) {
            data = d;
            next = prev = null;
        }
    }

    /* Function to reverse a Doubly Linked List */
    void reverse() {
        Node prev = null, next = null, curr = head;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head=prev;
    }

    /* UTILITY FUNCTIONS */
    /* Function to insert a node at the beginning of the
     * Doubly Linked List */
    void push(int new_data) {
        /* allocate node */
        Node new_node = new Node(new_data);
 
        /* since we are adding at the beginning,
         prev is always NULL */
        new_node.prev = null;

        /* link the old list off the new node */
        new_node.next = head;

        /* change prev of head node to new node */
        if (head != null) {
            head.prev = new_node;
        }

        /* move the head to point to the new node */
        head = new_node;
    }

    /* Function to print nodes in a given doubly linked list
     This function is same as printList() of singly linked
     list */
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        ReverseDLL list = new ReverseDLL();
 
        /* Let us create a sorted linked list to test the
         functions Created linked list will be 10->8->4->2
       */
        list.push(2);
        list.push(4);
        list.push(8);
        list.push(10);

        System.out.println("Original linked list ");
        list.printList(head);

        list.reverse();
        System.out.println("");
        System.out.println("The reversed Linked List is ");
        list.printList(head);
    }
}