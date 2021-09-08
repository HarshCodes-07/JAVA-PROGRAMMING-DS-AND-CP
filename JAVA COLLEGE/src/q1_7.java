//Write a program in Java to print the corresponding week day for the given day
//no. of the current month using switch..case statement.
import java.util.Scanner;

public class q1_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day number : ");
        int day = sc.nextInt();
        day = day % 7;
        switch (day) {
            case 1 -> System.out.println("FRIDAY");
            case 2 -> System.out.println("SATURDAY");
            case 3 -> System.out.println("SUNDAY");
            case 4 -> System.out.println("MONDAY");
            case 5 -> System.out.println("TUESDAY");
            case 6 -> System.out.println("WEDNESDAY");
            case 0 -> System.out.println("THURSDAY");
        }
    }
}
