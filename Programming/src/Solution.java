import java.util.*;

public class Solution {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0;
        if (sc.hasNext())
            t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            String s1 = sc.next();
            String s2 = sc.next();
            solve(s1, s2);
        }
    }

    private static void solve(String s1, String s2) {
        int u1 = 0, u2 = 0, u3 = 0;
        int diff = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == '?' && s2.charAt(i) == '?')
                u3++;
            else if (s1.charAt(i) == '?')
                u1++;
            else if (s2.charAt(i) == '?')
                u2++;
            else if (s1.charAt(i) != s2.charAt(i))
                diff++;
        }
        System.out.println(diff + " " + (diff + u1 + u2 +u3));
    }
}
