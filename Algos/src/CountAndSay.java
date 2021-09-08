import java.util.ArrayList;
import java.util.Scanner;

public class CountAndSay {
    public static void main(String[] args) {
        System.out.println(countAndsay(4));
    }

    private static String countAndsay(int n) {
        String ans = "1";
        if (n == 1) {
            return ans;
        }
        for (int i = 1; i < n; i++) {
            ArrayList<ArrayList<Integer>> a = new ArrayList<>();
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(Integer.parseInt(String.valueOf(ans.charAt(0))));
            for (int j = 1; j < ans.length(); j++) {
                int x = Integer.parseInt(String.valueOf(ans.charAt(j)));
                int y = Integer.parseInt(String.valueOf(ans.charAt(j - 1)));
                if (x != y) {
                    a.add(temp);
                    temp = new ArrayList<>();
                    temp.add(x);
                } else {
                    temp.add(x);
                }
            }
            a.add(temp);
            ans = "";
            for (ArrayList<Integer> x : a) {
                int d = x.size();
                int k = x.get(0);
                ans += Integer.toString(d) + Integer.toString(k);
            }
            System.out.println(a);
        }
        return ans;
    }
}
