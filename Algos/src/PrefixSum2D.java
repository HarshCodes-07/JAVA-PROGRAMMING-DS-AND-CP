import java.util.Arrays;

public class PrefixSum2D {
    public static void main(String[] args) {
        int[][] a = {{1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1}};
        prefixSum2D(a);
    }

    private static void prefixSum2D(int[][] a) {
        int n = a.length;
        int m = a[0].length;
        int[][] psa = new int[n][m];
        psa[0][0] = a[0][0];
        for (int i = 1; i < n; i++) {
            psa[i][0] = a[i][0] + psa[i - 1][0];
        }
        for (int i = 1; i < m; i++) {
            psa[0][i] = a[0][i] + psa[0][i - 1];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                psa[i][j] = a[i][j] + psa[i - 1][j] + psa[i][j - 1] - psa[i - 1][j - 1];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(psa[i][j] + " ");
            }
            System.out.println();
        }
    }
}
