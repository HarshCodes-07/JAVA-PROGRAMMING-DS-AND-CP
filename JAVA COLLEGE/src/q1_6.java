//Write a program in Java to print the corresponding grade for the given mark
//using if..else statement.
import java.util.Scanner;

public class q1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks = sc.nextInt();
        int g = marks/10;
        if (g >= 9) {
            System.out.println("GRADE -> O");
        } else if (g == 8) {
            System.out.println("GRADE -> E");
        } else if (g == 7) {
            System.out.println("GRADE -> A");
        } else if (g == 6) {
            System.out.println("GRADE -> B");
        } else if (g == 5)
            System.out.println("GRADE -> C");
        else System.out.println("GRADE -> F");
    }
}
