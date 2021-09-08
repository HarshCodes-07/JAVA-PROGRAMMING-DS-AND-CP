import java.util.Stack;
import java.util.Arrays;

public class StockSpan {
    // A stack based efficient method to calculate
    // stock span values
    static void calculateSpan(int price[], int n, int S[]) {
        Stack<Integer> s = new Stack<>();
        s.push(0);
        S[0] = 1;
        for (int i = 1; i < n; i++) {
            while (!s.isEmpty() && price[s.peek()] <= price[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                S[i] = i + 1;
            } else {
                S[i] = i - s.peek();
            }
            s.push(i);
        }
    }

    // A utility function to print elements of array
    static void printArray(int arr[]) {
        System.out.print(Arrays.toString(arr));
    }

    // Driver method
    public static void main(String[] args) {
        int[] price = {10, 4, 5, 90, 120, 80};
        int n = price.length;
        int[] S = new int[n];

        // Fill the span values in array S[]
        calculateSpan(price, n, S);

        // print the calculated span values
        printArray(S);
    }
}