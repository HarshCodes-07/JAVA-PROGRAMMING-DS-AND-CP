import java.util.*;
import java.util.Stack;

public class BalancedParanthesis {

    // function to check if brackets are balanced
    static boolean areBracketsBalanced(String expr) {
        Stack<Character> s = new Stack<>();
        boolean ans = true;
        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                s.push(c);
            } else {
                if (s.isEmpty()) {
                    ans = false;
                    break;
                } else {
                    char top = s.pop();
                    if (!(c == ')' && top == '(' || c == '}' && top == '{' || c == ']' && top == '[')) {
                        ans = false;
                        break;
                    }
                }
            }
        }
        if (!s.isEmpty()) {
            ans = false;
        }
        return ans;
    }

    // Driver code
    public static void main(String[] args) {
        String expr = "([{}])";

        // Function call
        if (areBracketsBalanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
}