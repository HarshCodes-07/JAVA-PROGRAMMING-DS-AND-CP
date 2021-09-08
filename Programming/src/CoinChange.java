public class CoinChange {
    public static void main(String[] args) {
        int[] coins = {9, 6, 5, 1};
        int m = coins.length;
        int V = 11;
        System.out.println("Minimum coins required is "
                + minCoins(coins, m, V));
    }

    private static int minCoins(int[] coins, int m, int v) {
        int[] dp = new int[v + 1];
        dp[0] = 0;
        for (int i = 1; i <= v; i++)
            dp[i] = Integer.MAX_VALUE;
        for (int i = 1; i <= v; i++) {
            for (int j = 0; j < m; j++) {
                if (coins[j] <= i) {
                    int sub_res = dp[i - coins[j]];
                    if (sub_res != Integer.MAX_VALUE && sub_res + 1 < dp[i])
                        dp[i] = sub_res + 1;
                }
            }
        }
        return dp[v];
    }
}
