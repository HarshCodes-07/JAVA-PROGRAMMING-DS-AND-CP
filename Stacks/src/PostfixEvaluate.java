import java.util.Stack;

public class PostfixEvaluate {
    static int evaluatePostfix(String exp) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                s.push((c-'0'));
            } else {
                int a = s.pop();
                int b = s.pop();
                if (c == '-') {
                    s.push(b-a);
                }
                if (c == '+') {
                    s.push(b+a);
                }
                if (c == '*') {
                    s.push(b*a);
                }
                if (c == '/') {
                    s.push(b/a);
                }
                if (c == '^') {
                    s.push(b^a);
                }
            }
        }
        return s.pop();
    }

    // Driver program to test above functions
    public static void main(String[] args) {
        String exp = "231*+9-";
        System.out.println("postfix evaluation: " + evaluatePostfix(exp));
    }
}