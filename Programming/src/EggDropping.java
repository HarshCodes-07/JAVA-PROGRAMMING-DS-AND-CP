public class EggDropping {

    //Solution using Dynamic Programming Technique to consume lesser Memory
    private static int eggDrop(int n, int k) {
        //Create a Table for tabulation
        int[][] dp = new int[n + 1][k + 1];
        // We need 1 trial for 1 floor and 0 trial for 0 floor
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
            dp[i][1] = 1;
        }
        // the no of trials is equal to no of floor if there is only one egg
        for (int j = 0; j <= k; j++) {
            dp[1][j] = j;
        }
        int res;
        // get result as the minimum of { Maximum of the two cases }
        // Case 1 : Egg drops and breaks so egg -1 and floor also -1
        // Case 2 : Egg drops and does not break so egg remains same but floors -x
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= k; j++) {
                dp[i][j] = Integer.MAX_VALUE;
                for (int x = 1; x <= j; x++) {
                    res = 1 + Math.max(dp[i - 1][x - 1], dp[i][j - x]);
                    if (res < dp[i][j])
                        dp[i][j] = res;
                }
            }
        }
        return dp[n][k];
    }

    public static void main(String args[]) {
        int n = 3, k = 10;
        System.out.print("Minimum number of "
                + "trials in worst case with "
                + n + " eggs and " + k
                + " floors is Equal to : ---> " + eggDrop(n, k));
    }
}


// Solution using Recursive Technique
   /* private static int eggDrop(int n, int k) {
        // if the no of floor is just 1 or zero it is equal to no of trials
        if (k == 1 || k == 0)
            return k;
        // if egg is one or zero no of trials required is equal to the no of floors
        if (n == 1)
            return k;
        int min = Integer.MAX_VALUE;
        int res;
        // get result as the minimum of { Maximum of the two cases }
        // Case 1 : Egg drops and breaks so egg -1 and floor also -1
        // Case 2 : Egg drops and does not break so egg remains same but floors -x
        for (int x = 1; x <= k; x++) {
            res = Math.max(eggDrop(n - 1, x - 1), eggDrop(n, k - x));
            if (res <= min)
                min = res;
        }
        // 1 extra for break
        return min + 1;
    } */