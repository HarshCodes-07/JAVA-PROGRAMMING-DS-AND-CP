package Assignement_10;

import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        String s1 = "Mayank Ranjan Patel";
        String s2 = "Ahmed Asmit Padhi";
        System.out.println("Before performing the operation : ");
        System.out.println("First String : " + s1);
        System.out.println("Second String : " + s2);
        String[] a = new String[3];
        int k = 0, start = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == ' ') {
                a[k++] = s1.substring(start, i);
                start = i + 1;
            }
        }
        a[k] = s1.substring(start);
        String[] b = new String[3];
        k = 0;
        start = 0;
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == ' ') {
                b[k++] = s2.substring(start, i);
                start = i + 1;
            }
        }
        b[k] = s2.substring(start);
        String temp = a[2];
        a[2] = b[2];
        b[2] = temp;
        System.out.println("After performing the operation : ");
        System.out.println("First String : " + a[0] + " " + a[1] + " " + a[2]);
        System.out.println("Second String : " + b[0] + " " + b[1] + " " + b[2]);
    }
}
