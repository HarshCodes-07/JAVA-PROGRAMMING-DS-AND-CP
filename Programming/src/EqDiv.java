import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class EqDiv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int T = 0;
        int k = sc.nextInt();
        if (sc.hasNext())
            T = sc.nextInt();
        for (int x = 1; x <= T; x++) {
            long n = sc.nextLong();
            solve(n);
            System.out.println();
        }
        sc.close();
    }

    private static void solve(long n) {
        ArrayList<Long> a = new ArrayList<>();
        ArrayList<Long> b = new ArrayList<>();
        long sum = n * (n + 1) / 2;
        long aSum = sum / 2;
        for (long i = n; i > 0; i--) {
            if (aSum - i >= 0) {
                a.add(i - 1);
                aSum -= i;
                System.out.print(0);
            } else {
                b.add(i);
                System.out.print(1);
            }
        }
    }
}
