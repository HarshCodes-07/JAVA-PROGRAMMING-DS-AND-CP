import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FindXor {
    static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

    public static void main(String[] args) {
        int T = 0;
        if (sc.hasNext())
            T = sc.nextInt();
        for (int x = 1; x <= T; x++) {
            long n = sc.nextLong();
            if (solve(n) == -1)
                break;
            System.out.println();
            System.out.flush();
        }
        sc.close();
    }

    private static int solve(long n) {
        int i;
        long sum, res;
        int maxQuestions = 20;
        ArrayList<Long> a = new ArrayList<>();
        for (i = 0; i < maxQuestions; i++) {
            long k = 1 << (i + 1);
            System.out.println(1 + " " + k);
            System.out.flush();
            res = sc.nextLong();
            a.add(res);
        }
        Collections.reverse(a);
        long[] arr = new long[a.size()];
        for (i = 0; i < maxQuestions; i++) {
            arr[i] = a.get(i);
        }
        long k = n * (1 << 20);
        sum = arr[0] - k;
        long ans = 0;
        for (i = 1; i < a.size(); i++) {
            long aa = arr[i];
            long complement = aa - sum;
            long temp = complement / (1 << (a.size() - i)) / 2;
            if (aa >= sum) {
                arr[i] = (n - (complement / temp));
            } else {
                arr[i] = (n + (complement / temp));
            }
        }
        //System.out.println(a);
        for (i = 1; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                long kkk = a.size() - i;
                ans += 1 << kkk;
            }
        }
        sum++;
        if (sum % 2 == 0)
            ans++;
        System.out.println(2 + " " + ans);
        System.out.flush();
        int flag;
        flag = sc.nextInt();
        return flag;
    }
}

