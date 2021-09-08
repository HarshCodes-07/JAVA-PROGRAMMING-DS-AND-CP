public class BinomialCoefficient {
    public static void main(String[] args) {
        int n = 5, k = 2;
        System.out.printf("Value of C(%d, %d) is %d ",
                n, k, binomialCoeff(n, k));
    }

    /* Recursive Approach
    private static int binomialCoeff(int n, int k) {
        if (k == 0 || k == n)
            return 1;
        return binomialCoeff(n - 1, k - 1) + binomialCoeff(n - 1, k);
    }*/


    // A Dynamic Programming based solution that uses table C[][] to
    // calculate the Binomial Coefficient
    private static int binomialCoeff(int n, int k) {
        int[] c = new int[k + 1];
        c[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = Math.min(i, k); j > 0; j--) {
                c[j] = c[j] + c[j - 1];
            }
        }
        return c[k];
    }
}
