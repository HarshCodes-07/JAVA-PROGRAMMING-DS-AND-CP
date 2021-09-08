
class SortedInsert {
    Node head;

    // Constructor
    SortedInsert() {
        head = null;
    }

    /* function to insert a new_node in a list in sorted way.
     Note that this function expects a pointer to head node
     as this can modify the head of the input linked list */
    void sortedInsert(Node new_node) {
        //Empty List just insert
        //if less than head add at begining
        // check last by .next=head and if greater add at end
        // check if lesser than next add after curr
        if (head == null) {
            new_node.next=new_node;
            head=new_node;
        } else {
            Node curr = head;
            if (new_node.data <= curr.data) {
                while (curr.next != head) {
                    curr = curr.next;
                }
                curr.next = new_node;
                new_node.next = head;
                head = new_node;
            } else {
                while (curr.next != head && curr.next.data < new_node.data) {
                    curr = curr.next;
                }
                new_node.next = curr.next;
                curr.next = new_node;
            }
        }
    }

    // Utility method to print a linked list
    void printList() {
        if (head != null) {
            Node temp = head;
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
        }
    }

    // Driver code to test above
    public static void main(String[] args) {
        SortedInsert list = new SortedInsert();

        // Creating the linkedlist
        int arr[] = new int[]{12, 56, 2, 11, 1, 90};

        /* start with empty linked list */
        Node temp = null;
 
        /* Create linked list from the array arr[].
         Created linked list will be 1->2->11->12->56->90*/
        for (int i = 0; i < 6; i++) {
            temp = new Node(arr[i]);
            list.sortedInsert(temp);
        }

        list.printList();
    }
}