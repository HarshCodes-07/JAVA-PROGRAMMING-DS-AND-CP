package Assignement_10;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to Change the case of the string 2 to " +
                "Reverse the string 3 to Compare two strings 4 to Insert one string into another");
        int c = sc.nextInt();
        if (c == 1) {
            System.out.println("Enter the String : ");
            String s = sc.next();
            System.out.println("Enter 1 to change to upper case and 2 for lower case : ");
            int x = sc.nextInt();
            if (x == 1) {
                System.out.println(s.toUpperCase());
            } else {
                System.out.println(s.toLowerCase());
            }
        } else if (c == 2) {
            System.out.println("Enter the String : ");
            StringBuilder s = new StringBuilder(sc.next());
            System.out.println("After Reversing : " + s.reverse());
        } else if (c == 3) {
            System.out.println("Enter the String 1 : ");
            String a = sc.next();
            System.out.println("Enter the String 2 : ");
            String b = sc.next();
            if (a.compareTo(b) > 0) {
                System.out.println("A is lexographically Greater than B");
            } else if (a.compareTo(b) < 0) {
                System.out.println("A is lexographically Smaller than B");
            } else {
                System.out.println("A is lexographically Equal to B");
            }
        }else{
            System.out.println("Enter the String 1 : ");
            String a = sc.next();
            System.out.println("Enter the String 2 : ");
            String b = sc.next();
            a=a.concat(b);
            System.out.println("After Inserting b to a : ");
            System.out.println(a);
        }
    }
}
