import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class AdaMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int T = 0;
        if (sc.hasNext())
            T = sc.nextInt();
        for (int x = 1; x <= T; x++) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            solve(n, a);
        }
        sc.close();
    }

    private static void solve(int n, int[][] a) {
        int x = -1;
        int prev = x;
        int ans=0;
        int count;
        do {
            count = 1;
            prev = x;
            for (int i = 0; i < n; i++) {
                if (a[0][i] != count++)
                    x = i;
            }
            if (prev != x) {
                for (int i = 0; i <= x; i++)
                    for (int j = i + 1; j <= x; j++) {
                        int temp = a[i][j];
                        a[i][j] = a[j][i];
                        a[j][i] = temp;
                    }
                ans++;
            }
        } while (x != prev);
        System.out.println(ans);
    }

}
