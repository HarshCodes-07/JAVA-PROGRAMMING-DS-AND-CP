import java.util.Stack;

class InfixToPostFix {
    static int Prec(char ch) {
        switch (ch)
        {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }

    static String infixToPostfix(String exp) {
        String output = "";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                output += c;
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    output += stack.pop();
                }
                if (!stack.isEmpty())
                    stack.pop();
            } else {
                while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())) {
                    output += stack.pop();
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty())
            output += stack.pop();
        return output;
    }

    public static void main(String[] args) {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(infixToPostfix(exp));
    }
}