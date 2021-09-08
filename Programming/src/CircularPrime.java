import java.util.Scanner;

public class CircularPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        String s = Integer.toString(n);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            String x = (s.substring(i) + s.substring(0, i));
            if (isPrime(Integer.parseInt(x))) {
                count++;
            }
        }
        if (count == s.length()) {
            System.out.println("YES, IT IS A CIRCULAR PRIME NUMBER");
        } else {
            System.out.println("NO, IT IS NOT A CIRCULAR PRIME NUMBER");
        }

    }

    private static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        else if (n == 2)
            return true;
        else if (n % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
