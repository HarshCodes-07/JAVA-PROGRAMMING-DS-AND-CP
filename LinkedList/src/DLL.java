// A complete working Java program to demonstrate all

// Class for Doubly Linked List
public class DLL {
    Node head; // head of list

    /* Doubly Linked list Node*/
    class Node {
        int data;
        Node prev;
        Node next;

        // Constructor to create a new node
        // next and prev is by default initialized as null
        Node(int d) {
            data = d;
        }
    }

    // Adding a node at the front of the list
    public void push(int new_data) {
        Node currHead = head;
        Node new_node = new Node(new_data);
        new_node.next = currHead;
        currHead.prev = new_node;
        head = new_node;
    }

    /* Given a node as prev_node, insert
    a new node after the given node */
    public void InsertAfter(Node prev_Node, int new_data) {
        if (prev_Node == null) {
            System.out.println("The given Node doesn't exist");
        }
        Node new_Node = new Node(new_data);
        new_Node.next = prev_Node.next;
        new_Node.prev = prev_Node;
        prev_Node.next=new_Node;
        if (new_Node.next!=null){
            new_Node.next.prev=new_Node;
        }
    }

    // Add a node at the end of the list
    void append(int new_data) {
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new_node;
            return;
        }
        Node ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = new_node;
        new_node.prev = ptr;
    }

    // This function prints contents of
    // linked list starting from the given node
    public void printlist(Node node) {
        Node last = null;
        System.out.println("Traversal in forward Direction");
        while (node != null) {
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }
        System.out.println();
        System.out.println("Traversal in reverse direction");
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
    }

    /* Driver program to test above functions*/
    public static void main(String[] args) {
        /* Start with the empty list */
        DLL dll = new DLL();

        // Insert 6. So linked list becomes 6->NULL
        dll.append(6);

        // Insert 7 at the beginning. So
        // linked list becomes 7->6->NULL
        dll.push(7);

        // Insert 1 at the beginning. So
        // linked list becomes 1->7->6->NULL
        dll.push(1);

        // Insert 4 at the end. So linked
        // list becomes 1->7->6->4->NULL
        dll.append(4);

        // Insert 8, after 7. So linked
        // list becomes 1->7->8->6->4->NULL
        dll.InsertAfter(dll.head.next, 8);

        System.out.println("Created DLL is: ");
        dll.printlist(dll.head);
    }
}