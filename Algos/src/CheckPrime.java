import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Is " + n + " Prime ? : " + chechprime(n));
    }

    private static Boolean chechprime(int n) {
        if (n == 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if ((n % i) == 0)
                return false;
        }
        return true;
    }
}
