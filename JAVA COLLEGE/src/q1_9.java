//Write a program in Java to add all the values in a given number and print.
//Ex: 1235&gt;11.
import java.util.Scanner;

public class q1_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
