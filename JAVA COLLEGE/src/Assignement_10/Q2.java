package Assignement_10;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two strings : ");
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = s1.concat(s2);
        int lenOfEach = s3.length() / 4;
        for (int i = 0, j = 0; j < 4; i += 3, j++) {
            if (j == 3) {
                System.out.println(s3.substring(i));
            } else
                System.out.println(s3.substring(i, i + lenOfEach));
        }
    }
}
