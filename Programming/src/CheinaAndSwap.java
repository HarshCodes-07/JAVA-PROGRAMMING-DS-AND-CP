import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CheinaAndSwap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int T = 0;
        if (sc.hasNext())
            T = sc.nextInt();
        for (int x = 1; x <= T; x++) {
            long n = sc.nextLong();
            long sum = (n * (n + 1)) / 2;
            if ((sum % 2 == 0)) {
                solve(n, sum);
            } else {
                System.out.println(0);
            }
        }
        sc.close();
    }

    private static void solve(long n, long sum) {
        long index = findClosest(n, sum);
        long sumAtindex = ((index) * (index + 1)) / 2;
        long ans = n - index;
        if (sum == sumAtindex * 2) {
            ans += (index * (index - 1)) / 2;
            ans += ((n - index) * (n - index - 1)) / 2;
            System.out.println(ans);
        } else {
            System.out.println(n - (index + 1) + 2);
        }
    }

    public static long findClosest(long n, long target) {
        if (target <= 1)
            return 0;
        if (target / 2 >= target)
            return n;
        long i = 0, j = n, mid;
        while (i < j) {
            mid = (i + j) / 2;
            if ((mid * (mid + 1)) / 2 == target / 2)
                return mid;
            if (target / 2 < (mid * (mid + 1)) / 2) {
                j = mid;
            } else {
                i = mid + 1;
            }
        }
        return j;
    }
}