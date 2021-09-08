public class DLL {
    Node head; // head of list

    /* Doubly Linked list Node*/
    static class Node {
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
        Node new_node = new Node(new_data);
        new_node.next = head;
        if (head != null)
            head.prev = new_node;
        head = new_node;
    }

    /* Given a node as prev_node, insert a new node after the given node */
    public void InsertAfter(Node prev_Node, int new_data) {
        if (prev_Node == null) {
            System.out.println("Invalid");
            return;
        }
        Node new_node = new Node(new_data);
        new_node.next = prev_Node.next;
        prev_Node.next = new_node;
        new_node.prev = prev_Node;
        if (new_node.next != null) {
            new_node.next.prev = new_node;
        }
    }

    // Add a node at the end of the list
    void append(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = null;
        new_node.prev = null;
        if (head == null) {
            head = new_node;
            return;
        }
        Node last = head;
        while (last.next != null)
            last = last.next;
        last.next = new_node;
        new_node.prev = last;
    }

    // This function prints contents of linked list starting from the given node
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
        DLL dll = new DLL();

        // Insert 2. So linked list becomes 2->NULL
        dll.push(2);

        // Insert 4. So linked list becomes 4->2->NULL
        dll.push(4);

        // Insert 8. So linked list becomes 8->4->2->NULL
        dll.push(8);

        // Insert 10. So linked list becomes 10->8->4->2->NULL
        dll.push(10);

        System.out.print("Created DLL is: ");
        dll.printlist(dll.head);

        // Deleting first node
        dll.deleteNode(dll.head);

        // List after deleting first node
        // 8->4->2
        System.out.print("\nList after deleting first node: ");
        dll.printlist(dll.head);

        // Deleting middle node from 8->4->2
        dll.deleteNode(dll.head.next);

        System.out.print("\nList after Deleting middle node: ");
        dll.printlist(dll.head);
    }

    private void deleteNode(Node del) {
        if (head == null || del == null)
            return;
        if (head == del)
            head = head.next;
        if (del.next != null)
            del.next.prev = del.prev;
        if (del.prev != null) {
            del.prev.next=del.next;
        }
    }
}