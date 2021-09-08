import java.util.Stack;

class SpecialStack extends Stack<Integer> {
    Stack<Integer> min = new Stack<>();

    void push(int x) {
        if (super.isEmpty()) {
            min.push(x);
            super.push(x);
        } else {
            int a = min.peek();
            super.push(x);
            min.push(Math.min(a, x));
        }
    }

    public Integer pop() {
        min.pop();
        return super.pop();
    }

    int getMin() {
        return min.peek();
    }

    public static void main(String[] args) {
        SpecialStack s = new SpecialStack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.getMin());
        s.push(5);
        System.out.println(s.getMin());
    }
}