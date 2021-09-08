import java.util.Scanner;

public class q6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int even = 0, odd = 0;
        for (int i = 0; i < 10; i++) {
            a[i] = Integer.parseInt(args[i]);
            if (a[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("NO OF EVEN : " + even);
        System.out.println("NO OF ODD : " + odd);
    }
}
