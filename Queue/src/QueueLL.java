// Java program for linked-list implementation of queue

// A linked list (LL) node to store a queue entry
class QNode {
    int key;
    QNode next;

    // constructor to create a new linked list node
    public QNode(int key) {
        this.key = key;
        this.next = null;
    }
}

// A class to represent a queue
// The queue, front stores the front node of LL and rear stores the
// last node of LL
class QueueLL {
    QNode front, rear;

    public QueueLL() {
        this.front = this.rear = null;
    }

    // Method to add an key to the queue.
    void enqueue(int key) {
        QNode temp = new QNode(key);
        if (this.rear == null) {
            this.rear = this.front = temp;
            return;
        }
        this.rear.next = temp;
        this.rear = temp;
    }

    // Method to remove an key from queue.
    void dequeue() {
        if (this.front == null)
            return;
        this.front = this.front.next;
        if (this.front == null)
            this.rear = null;
    }
}

// Driver class
class Tester {
    public static void main(String[] args) {
        QueueLL q = new QueueLL();
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
        q.dequeue();
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.dequeue();
        System.out.println("Queue Front : " + q.front.key);
        System.out.println("Queue Rear : " + q.rear.key);
    }
}
// This code is contributed by Gaurav Miglani
