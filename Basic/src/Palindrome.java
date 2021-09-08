import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean ans = checkPalindrome(s);
        if (ans)
            System.out.println("yes , Palindrome");
        else
            System.out.println("no , not Palindrome");
    }

    private static boolean checkPalindrome(String s) {
        String rev = reverse(s);
        System.out.println(rev);
        return s.equals(rev);
    }

    private static String reverse(String s) {
        if (s.isEmpty())
            return s;
        return "" + s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
    }
}
