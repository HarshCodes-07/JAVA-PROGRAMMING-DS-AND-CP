import java.util.Scanner;

public class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.head = new Node(1);
        llist.head.next = new Node(2);
        llist.head.next.next = new Node(4);
        System.out.println("Printing the Linked List : ");
        traverse(llist.head);
        System.out.println("Length :" + getCount(llist.head));
        llist.head = push(llist.head, 0);
        System.out.println("After adding to front : ");
        traverse(llist.head);
        append(llist.head, 5);
        System.out.println("After adding to End : ");
        traverse(llist.head);
        System.out.println("Length : " + getCountRecursive(llist.head));
        insertAfter(llist.head, llist.head.next.next, 3);
        System.out.println("After adding 3 After node 2  : ");
        traverse(llist.head);
        deleteNode(llist.head, 3);
        System.out.println("After Deleting Node 3  : ");
        traverse(llist.head);
        deleteAtPosition(llist.head, 1);
        System.out.println("After Deleting Node at Position 1  : ");
        traverse(llist.head);
        System.out.println("Length :" + getCount(llist.head));

    }

    private static int getCountRecursive(Node head) {
        if (head == null)
            return 0;
        else
            return 1 + getCountRecursive(head.next);
    }

    private static int getCount(Node head) {
        Node ptr = head;
        int i = 0;
        while (ptr != null) {
            i++;
            ptr = ptr.next;
        }
        return i;
    }

    private static Node deleteAtPosition(Node head, int i) {
        if (head == null)
            return head;
        Node ptr = head;
        if (i == 0) {
            head = ptr.next;
            return head;
        }
        for (int j = 0; ptr != null && j < i - 1; j++) {
            ptr = ptr.next;
        }
        if (ptr == null || ptr.next == null) {
            return head;
        }
        Node next = ptr.next.next;
        ptr.next = next;
        return head;
    }

    private static Node deleteNode(Node head, int i) {
        Node ptr = head;
        if (ptr == null)
            return head;
        if (ptr.data == i) {
            head = null;
        }
        Node prev = null;
        while (ptr != null && ptr.data != i) {
            prev = ptr;
            ptr = ptr.next;
        }
        if (ptr == null)
            return head;
        prev.next = ptr.next;
        return head;
    }

    //Insert After a Node
    private static Node insertAfter(Node head, Node prev, int i) {
        Node next = prev.next;
        Node new_node = new Node(i);
        prev.next = new_node;
        new_node.next = next;
        return head;
    }

    //Insert At the end
    private static Node append(Node head, int i) {
        Node ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = new Node(i);
        return head;
    }

    //ADD A NODE TO THE FRONT
    private static Node push(Node head, int i) {
        Node ptr = head;
        Node new_node = new Node(i);
        new_node.next = ptr;
        head = new_node;
        return head;
    }

    private static void traverse(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
}
