import java.util.Arrays;

public class Fibonacci {
    private static int[] dp = new int[50];

    public static void main(String[] args) {
        System.out.println("The First five Fibonacci Numbers are : ");
        System.out.println(F(20));
    }

    private static int F(int n) {
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    //Recursive
//    private static int F(int i) {
//        if (i == 1) {
//            return 0;
//        }
//        if (i == 2) {
//            return 1;
//        }
//        return F(i - 1) + F(i - 2);
//    }

}
