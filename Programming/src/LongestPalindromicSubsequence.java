public class LongestPalindromicSubsequence {

    // Using Dynamic Programming
    private static int lps(char[] l) {
        int n = l.length, j;
        int[][] dp = new int[n][n];
        for(int i=0;i<n;i++)
            dp[i][i]=1;
        for (int c1 = 2; c1 <= n; c1++) {
            for (int i = 0; i < n - c1 +1; i++) {
                j = i + c1 - 1;
                if (l[i] == l[j] && c1 == 2)
                    dp[i][j] = 2;
                else if (l[i] == l[j])
                    dp[i][j] = 2 + dp[i + 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
            }
        }
        return dp[0][n - 1];
    }

    public static void main(String[] args) {
        String seq = "GEEKSFORGEEKS";
        int n = seq.length();
        System.out.printf("The length of the LPS is %d", lps(seq.toCharArray()));
    }
}
// Recursive Approach
    /*private static int lps(char[] l, int i, int j) {
        // If Length is 1 ans is 1
        if (i == j)
            return 1;
        // if length is 2 and they are same ans is 2
        if (l[i] == l[j] && j == i + 1)
            return 2;
        // if length is greater than 2 and first and last characters are same
        if (l[i] == l[j]) {
            return 2 + lps(l, i + 1, j - 1);
        }
        return Math.max(lps(l, i, j - 1), lps(l, i + 1, j));
    }
     */
