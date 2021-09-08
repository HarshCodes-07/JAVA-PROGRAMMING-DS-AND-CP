import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
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
        System.out.println("TEST CASE");
        int n = sc.nextInt();
        int[] a = sc.readArray(n);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        int ans = Integer.MAX_VALUE;
        int temp = 0;
        // Count From Left
        {
            int pow = 0, x = 0, y = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] == max) {
                    pow = i + 1;
                    break;
                }
            }
            x = pow;
            for (int i = 0; i < n; i++) {
                if (a[i] == min) {
                    pow = i + 1;
                    break;
                }
            }
            y = pow;
            temp = Math.max(x, y);
        }
        ans = Math.min(temp, ans);
        System.out.println(temp+" "+ans);
        // Count From Right
        {
            int pow = 0;
            int x = 0, y = 0;
            for (int i = n - 1; i >= 0; i--) {
                if (a[i] == max) {
                    pow = i + 1;
                    break;
                }
            }
            x = (n - pow);
            for (int i = n - 1; i >= 0; i--) {
                if (a[i] == min) {
                    pow = i + 1;
                    break;
                }
            }
            y = (n - pow);
            temp = Math.max(x, y);
        }
        ans = Math.min(temp, ans);
        System.out.println(temp+" "+ans);
        // Count From BOTH
        {
            int pow = 0;
            for (int i = n - 1; i >= 0; i--) {
                if (a[i] == max) {
                    pow = i + 1;
                    break;
                }
            }
            temp += (n - pow);
            for (int i = 0; i < n; i++) {
                if (a[i] == min) {
                    pow = i + 1;
                    break;
                }
            }
            temp += pow;
        }
        ans = Math.min(temp, ans);
        System.out.println(temp+" "+ans);
        // Count From BOTH
        {
            int pow = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] == max) {
                    pow = i + 1;
                    break;
                }
            }
            temp += pow;
            for (int i = n - 1; i >= 0; i--) {
                if (a[i] == min) {
                    pow = i + 1;
                    break;
                }
            }
            temp += (n - pow);
        }
        ans = Math.min(temp, ans);
        System.out.println(temp+" "+ans);
        System.out.println(ans);
    }

    static boolean arraySortedOrNot(int a[], int n) {
        if (n == 1 || n == 0)
            return true;
        return a[n - 1] >= a[n - 2]
                && arraySortedOrNot(a, n - 1);
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