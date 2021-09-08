import java.util.*;

class twoStacks {
    int[] arr;
    int size;
    int top1, top2;

    // Constructor
    twoStacks(int n) {
        size = n;
        arr = new int[n];
        top1 = -1;
        top2 = size;
    }

    // Method to push an element x to stack1
    void push1(int x) {
        if (top1 < top2 - 1) {
            arr[++top1] = x;
        }
    }

    // Method to push an element
    // x to stack2
    void push2(int x) {
        if (top1 < top2 - 1) {
            arr[--top2] = x;
        }
    }

    // Method to pop an element from first stack
    int pop1() {
        if (top1 < 0)
            return -1;
        else {
            return arr[top1--];
        }
    }

    // Method to pop an element
    // from second stack
    int pop2() {
        if (top2 >= size)
            return -1;
        else {
            return arr[top2++];
        }
    }
};

class GFG {

    /* Driver program to test twStacks class */
    public static void main(String[] args) {
        twoStacks ts = new twoStacks(5);
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);
        System.out.print("Popped element from stack1 is "
                + " : " + ts.pop1() + "\n");
        ts.push2(40);
        System.out.print("Popped element from stack2 is "
                + ": " + ts.pop2()
                + "\n");
    }
}