class AddTwoNumbers {

    static Node head1, head2;

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node addTwoLists(Node first, Node second) {
        int carry = 0;
        Node dummy = new Node(-1);
        Node ptr = dummy;
        if (first == null) {
            return second;
        }
        if (second == null)
            return first;
        while (first != null && second != null) {
            int sum = first.data + second.data + carry;
            dummy.next = new Node(sum % 10);
            carry = sum / 10;
            first = first.next;
            second = second.next;
            dummy=dummy.next;
        }
        while (first != null) {
            int sum = first.data + carry;
            dummy.next = new Node(sum % 10);
            carry = sum / 10;
            first = first.next;
            dummy=dummy.next;
        }
        while (second != null) {
            int sum = second.data + carry;
            dummy.next = new Node(sum % 10);
            carry = sum / 10;
            second = second.next;
            dummy=dummy.next;
        }
        if (carry!=0){
            dummy.next = new Node(carry);
            dummy=dummy.next;
        }
        return ptr.next;
    }

    void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println("");
    }

    // Driver Code
    public static void main(String[] args) {
        AddTwoNumbers list = new AddTwoNumbers();

        // creating first list
        list.head1 = new Node(7);
        list.head1.next = new Node(5);
        list.head1.next.next = new Node(9);
        list.head1.next.next.next = new Node(4);
        list.head1.next.next.next.next = new Node(6);
        System.out.print("First List is ");
        list.printList(head1);

        // creating seconnd list
        list.head2 = new Node(8);
        list.head2.next = new Node(4);
        System.out.print("Second List is ");
        list.printList(head2);

        // add the two lists and see the result
        Node rs = list.addTwoLists(head1, head2);
        System.out.print("Resultant List is ");
        list.printList(rs);
    }
}