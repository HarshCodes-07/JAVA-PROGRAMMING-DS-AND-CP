//Write a program in Java to initialize two character variables in a program and
//display the characters in alphabetical order.
//Eg1: if first character is s and second is e
//O/P: e,s
//Eg2: if first character is a and second is e
//O/P: a,e
import java.util.Scanner;

public class q1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st the Character : ");
        char c = sc.next().charAt(0);
        System.out.println("Enter 2nt the Character : ");
        char d = sc.next().charAt(0);
        if (c < d) {
            System.out.println(c + "," + d);
        } else {
            System.out.println(d + "," + c);
        }
    }
}

