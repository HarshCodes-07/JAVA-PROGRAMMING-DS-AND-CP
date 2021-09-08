import java.util.Scanner;

//Write a program in Java to check the given 3-digit number is a palindrome
//number or not without using any loop.
public class q1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int a = n % 10;
        int b = n / 100;
        if (a == b)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
