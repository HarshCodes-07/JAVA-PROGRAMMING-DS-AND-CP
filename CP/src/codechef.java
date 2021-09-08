import java.util.*;

public class codechef {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        int t = 0;
//        if (sc.hasNext())
//            t = sc.nextInt();
//        for (int i = 1; i <= t; i++) {
        solve();
//        }
    }

    public static void solve() {
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] a = new char[n][m];
        for (int i = 0; i < n; i++) {
            char[] x = sc.next().toCharArray();
            if (m >= 0) System.arraycopy(x, 0, a[i], 0, m);
        }
        char[][] temp = new char[n][m];
        int k = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                k = 0;
            else
                k = 1;
            for (int j = 0; j < m; j++) {
                if (k % 2 == 0) {
                    temp[i][j] = 'B';
                } else {
                    temp[i][j] = 'W';
                }
                k++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == '.') {
                    a[i][j] = temp[i][j];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}