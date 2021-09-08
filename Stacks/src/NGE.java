import java.util.Arrays;
import java.util.Stack;

public class NGE {


    /* prints element and NGE pair for
       all elements of arr[] of size n */
    public static long[] nextLargerElement(long[] arr, int n) {
        // Your code here
        long[] res = new long[n];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (s.isEmpty()) {
                s.push(i);
                continue;
            }
            while (!s.isEmpty() && arr[s.peek()] < arr[i]) {
                res[s.pop()] = arr[i];
            }
            s.push(i);
        }
        while (!s.isEmpty()) {
            res[s.pop()] = -1;
        }
        return res;
    }

    // Driver Code
    public static void main(String[] args) {
        long arr[] = {11, 13, 21, 3};
        int n = arr.length;
        System.out.println(Arrays.toString(nextLargerElement(arr, n)));
    }
}