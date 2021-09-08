//Write a program in Java to initialize a number and count the no. of dissimilar
//digits from that number. (Ex- 4548, no. of digits=3)

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class q1_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        Set<Integer> s = new HashSet<>();
        while (n > 0) {
            s.add(n % 10);
            n /= 10;
        }
        System.out.println(s.size());
    }
}
