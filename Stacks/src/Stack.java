/* Java program to implement basic stack
operations */
class Stack {
    static final int MAX = 10;
    int top;
    int[] a = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        return top < 0;
    }

    Stack() {
        top = -1;
    }

    boolean push(int x) {
        if (top > MAX - 1) {
            System.out.println("OVERFLOWED STACK");
            return false;
        }
        a[++top] = x;
        return true;
    }

    int pop() {
        if (top < 0) {
            System.out.println("UNDERFLOW STACK");
            return -1;
        }
        return a[top--];
    }

    int top() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top];
            return x;
        }
    }
}

// Driver code
class Main {
    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        System.out.println(s.top + " Top element of Stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("IS the array Empty : + " + s.isEmpty());
    }
}