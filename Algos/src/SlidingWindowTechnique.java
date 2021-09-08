import java.util.Scanner;

public class SlidingWindowTechnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("MAX SUM OF K CONSECUTIVE ELEMENTS : " + slidingMaxSum(a, n, k));
    }

    private static int slidingMaxSum(int[] a, int n, int k) {
        int sumBase = 0;
        int ans = 0;
        for (int i = 0; i < k; i++) {
            sumBase += a[i];
        }
        for (int i = 1; i < n - k + 1; i++) {
            sumBase -= a[i - 1];
            sumBase += a[i + k - 1];
            ans = Math.max(ans, sumBase);
        }
        return ans;
    }
}
