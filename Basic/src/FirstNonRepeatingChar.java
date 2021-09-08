import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        findFirstNonRepeating(s);
    }

    private static void findFirstNonRepeating(String s) {
        HashMap<Character, Integer> o = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (o.containsKey(s.charAt(i)))
                o.put(s.charAt(i), o.get(s.charAt(i)) + 1);
            else
                o.put(s.charAt(i), 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (o.get(s.charAt(i)) == 1) {
                System.out.println(s.charAt(i));
                return;
            }
        }
    }
}
