import java.util.*;
class QueueTwoStacks {
    static class Queue {
        static Stack<Integer> s1 = new Stack<Integer>();
        static Stack<Integer> s2 = new Stack<Integer>();

        static void enQueue(int x) {
            s1.push(x);
        }
        static int deQueue() {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            int x = s2.pop();
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
            return x;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);

        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
    }
}
