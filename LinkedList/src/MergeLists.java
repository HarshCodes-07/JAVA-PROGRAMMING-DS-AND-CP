import java.util.*;

class MergeLists {
    Node head;

    /* Method to insert a node at
       the end of the linked list */
    public void addToTheLast(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }

    /* Method to print linked list */
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    // Driver Code
    public static void main(String args[]) {
    /* Let us create two sorted linked
       lists to test the methods
       Created lists:
           llist1: 5->10->15,
           llist2: 2->3->20
    */
        MergeLists llist1 = new MergeLists();
        MergeLists llist2 = new MergeLists();

        // Node head1 = new Node(5);
        llist1.addToTheLast(new Node(1));
        llist1.addToTheLast(new Node(1));

        // Node head2 = new Node(2);
        llist2.addToTheLast(new Node(2));
        llist2.addToTheLast(new Node(4));


        llist1.head = new Gfg().sortedMerge(llist1.head,
                llist2.head);
        llist1.printList();

    }
}

class Gfg {
    Node sortedMerge(Node headA, Node headB) {
        if (headA == null) {
            return headB;
        }
        if (headB == null) {
            return headA;
        }
        Node dummyNode = new Node(-100);
        Node ptr = dummyNode;
        while (headA != null && headB != null) {
            if (headA.data <= headB.data) {
                dummyNode.next = headA;
                headA = headA.next;
            } else {
                dummyNode.next = headB;
                headB = headB.next;
            }
            dummyNode = dummyNode.next;
        }
        while (headA != null) {
            dummyNode.next = headA;
            headA = headA.next;
            dummyNode = dummyNode.next;
        }
        while (headB != null) {
            dummyNode.next = headB;
            headB = headB.next;
            dummyNode = dummyNode.next;
        }
        return ptr.next;
    }
}
 