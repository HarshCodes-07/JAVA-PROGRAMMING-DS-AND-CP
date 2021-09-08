class CircularLL {

    static class Node {
        int data;
        Node next;

        Node() {
            next = null;
        }

        Node(int d) {
            this.data = d;
            next = null;
        }
    }

    static Node addToEmpty(Node last, int data) {
        if (last != null)
            return last;
        Node temp = new Node(data);
        last = temp;
        temp.next = last;
        return last;
    }

    static Node addBegin(Node last, int data) {
        if (last == null) {
            addToEmpty(last, data);
        }
        Node temp = new Node(data);
        temp.next = last.next;
        last.next = temp;
        return last;
    }

    static Node addEnd(Node last, int data) {
        if (last == null) {
            addToEmpty(last, data);
        }
        Node temp = new Node(data);
        temp.next = last.next;
        last.next = temp;
        last = temp;
        return last;
    }

    static Node addAfter(Node last, int data, int item) {
        if (last == null)
            return null;
        Node ptr = last.next;
        do {
            if (ptr.data == item) {
                Node temp = new Node(data);
                temp.next = ptr.next;
                ptr.next = temp;
                return last;
            }
            ptr = ptr.next;
        } while (ptr != last.next);
        System.out.println(item + " is not in the List");
        return last;
    }

    static void traverse(Node last) {
        if (last == null) {
            return;
        }
        Node ptr = last.next;
        do {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        } while (ptr != last.next);
    }

    // Driven code
    public static void main(String[] args) {
        Node last = null;

        last = addToEmpty(last, 6);
        last = addBegin(last, 4);
        last = addBegin(last, 2);
        last = addEnd(last, 8);
        last = addEnd(last, 12);
        last = addAfter(last, 10, 8);

        traverse(last);
    }
}