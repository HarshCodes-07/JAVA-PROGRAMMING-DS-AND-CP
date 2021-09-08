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
        double fraction_sum = 0;
        for (int i = 0; i < n; i++) {
            fraction_sum += (sc.nextDouble()) / 100;
        }
        System.out.println(fraction_sum / n);
    }
}