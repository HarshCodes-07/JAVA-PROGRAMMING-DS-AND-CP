package Assignement_8;

import java.util.Scanner;

class StackEmptyException extends Exception {
    public StackEmptyException(String str) {
        System.out.println(str);
    }
}

class StackFullException extends Exception {
    public StackFullException(String str) {
        System.out.println(str);
    }
}

public class Stack {
    private int top;
    private int[] storage;

    Stack(int capacity) throws StackEmptyException {
        if (capacity <= 0)
            throw new StackEmptyException(
                    "Stack cannot have negative Capacity.");
        storage = new int[capacity];
        top = -1;
    }

    void push(int value) throws StackFullException {
        if (top == storage.length)
            throw new StackFullException("Stack is Full");
        top++;
        storage[top] = value;
    }

    void pop() throws StackEmptyException {
        if (top == -1)
            throw new StackEmptyException("Stack is Empty");
        top--;
    }

    public static void main(String[] args) throws StackEmptyException, StackFullException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Stack : ");
        Stack s1 = new Stack(sc.nextInt());
        while (true) {
            System.out.println("Enter 1 to push : ");
            System.out.println("Enter 2 to pop : ");
            System.out.println("Enter 3 to exit : ");
            int ch = sc.nextInt();
            if (ch == 1) {
                System.out.println("Enter the element to push : ");
                int a = sc.nextInt();
                s1.push(a);
            } else if (ch == 2) {
                s1.pop();
                System.out.println("Element popped : ");
            } else
                break;
        }
    }
}