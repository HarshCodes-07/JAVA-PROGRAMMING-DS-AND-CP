import java.util.Scanner;

public class BinaryAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Binary Number : ");
        String s1 = sc.next();
        System.out.println("Enter 2nd Binary Number : ");
        String s2 = sc.next();
        String s3 = addBinary(s1, s2);
        System.out.println(s1 + "  +  " + s2 + "   =   " + s3);

    }

    private static String addBinary(String a, String b) {
        String result = "";
        int s = 0;
        int i = a.length() - 1, j = b.length() - 1;
        while (i >= 0 || j >= 0 || s == 1) {
            s += ((i >= 0) ? a.charAt(i) - '0' : 0);
            s += ((j >= 0) ? b.charAt(j) - '0' : 0);
            result = (char) (s % 2 + '0') + result;
            s /= 2;
            i--;
            j--;
        }
        return result;
    }
}
