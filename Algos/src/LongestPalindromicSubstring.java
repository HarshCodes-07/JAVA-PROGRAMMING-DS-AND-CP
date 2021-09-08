import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class LongestPalindromicSubstring {
    private static FastScanner sc = new FastScanner();
    private static long mod = 1000000000;
    private static HashMap<Long, Long> h = new HashMap<>();

    public static void main(String[] args) {
        int t = 0;
        if (sc.hasNext())
            t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            solve();
        }
    }

    public static void solve() {
        // start solving
        String s = sc.next();
        int n = s.length();
        boolean[][] table = new boolean[n][n];
        int ans = 1;
        int start = 0;
        for (int i = 0; i < n; i++) {
            table[i][i] = true;
        }
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                table[i][i + 1] = true;
                if (start == 0)
                    start = i;
                ans = 2;
            }
        }
        for (int k = 3; k <= n; k++) {
            int ch = 0;
            int currstr = start;
            for (int i = 0; i < n - k + 1; i++) {
                int j = i + k - 1;
                if (table[i + 1][j - 1] && s.charAt(i) == s.charAt(j)) {
                    table[i][j] = true;
                    if (k > ans) {
                        currstr = i;
                        if (ch == 0)
                            start = i;
                        else
                            start = Math.min(start, currstr);
                        ans = k;
                        ch = 1;
                    }
                }
            }
        }
        System.out.println(s.substring(start, start + ans));
    }


    static long lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

    static boolean isPrime(int n) {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    private static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    private static long modular_add(long a, long b) {
        return ((a % mod) + (b % mod)) % mod;
    }

    private static long modular_sub(long a, long b) {
        return ((a % mod) - (b % mod) + mod) % mod;
    }

    private static long modular_mult(long a, long b) {
        return ((a % mod) * (b % mod)) % mod;
    }

    static void sort(int[] a) {
        ArrayList<Integer> l = new ArrayList<>();
        for (int i : a) l.add(i);
        Collections.sort(l);
        for (int i = 0; i < a.length; i++) a[i] = l.get(i);
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        boolean hasNext() {
            if (st != null && st.hasMoreTokens()) {
                return true;
            }
            String tmp;
            try {
                br.mark(1000);
                tmp = br.readLine();
                if (tmp == null) {
                    return false;
                }
                br.reset();
            } catch (IOException e) {
                return false;
            }
            return true;
        }

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        long[] readArrayLong(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = nextLong();
            return a;
        }

        long nextLong() {

            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}