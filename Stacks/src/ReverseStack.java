import java.util.Stack;

class ReverseStack {

    // using Stack class for
    // stack implementation
    static Stack<Character> st = new Stack<>();

    // Below is a recursive function 
    // that inserts an element
    // at the bottom of a stack.
    static void insert_at_bottom(char x) {
        if (st.isEmpty()) {
            st.push(x);
        } else {
            Character top = st.pop();
            insert_at_bottom(x);
            st.push(top);
        }
    }

    // Below is the function that 
    // reverses the given stack using
    // insert_at_bottom()
    static void reverse() {
        if (!st.isEmpty()) {
            Character top = st.pop();
            reverse();
            insert_at_bottom(top);
        }
    }

    // Driver Code
    public static void main(String[] args) {

        // push elements into
        // the stack
        st.push('1');
        st.push('2');
        st.push('3');
        st.push('4');

        System.out.println("Original Stack");

        System.out.println(st);

        // function to reverse 
        // the stack
        reverse();

        System.out.println("Reversed Stack");

        System.out.println(st);
    }
}