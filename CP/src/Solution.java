import java.util.*;
import java.io.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        int T = sc.nextInt();
        for (int x = 1; x <= T; x++) {
            int ans = 0;
            int X = sc.nextInt();
            int Y = sc.nextInt();
            char[] c = sc.next().toCharArray();
            int Length = c.length;
            char last = '/';
            for (int i = 0; i < Length; i++) {
                if (last == 'C') {
                    if (c[i] == 'J')
                        ans += X;
                }
                if (last == 'J') {
                    if (c[i] == 'C')
                        ans += Y;
                }
                if (c[i] != '?')
                    last = c[i];
            }
            System.out.println("Case #" + x + ": " + ans);
        }
        sc.close();
    }
}