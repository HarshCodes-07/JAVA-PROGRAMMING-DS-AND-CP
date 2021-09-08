package Assignement_8;

import java.util.Scanner;

class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = 10;
            System.out.println("Enter number to divide 10 : ");
            int b = sc.nextInt();
            System.out.println("A / B : " + (a / b));
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("End of the try catch finally block");
        }
        System.out.println("End of Program");
    }
}