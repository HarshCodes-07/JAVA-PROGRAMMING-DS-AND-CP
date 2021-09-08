import java.math.BigInteger;
import java.util.Random;

import java.util.Scanner;

public class Karatsuba {
    private long multiply(long x, long y) {
        int size1 = getSize(x);
        int size2 = getSize(y);
        int N = Math.max(size1, size2);
        if (N < 10)
            return x * y;
        N = (N / 2) + N % 2;
        long m = (long) Math.pow(10, N);
        long b = x / m;
        long a = x - b * m;
        long d = y / m;
        long c = y - d * N;
        long z0 = multiply(a, c);
        long z1 = multiply(a + b, c + d);
        long z2 = multiply(b, d);
        return z0 + ((z1 - z0 - z2) * m) + (z2 * (long) (Math.pow(10, 2 * N)));
    }

    private int getSize(long num) {
        int ctr = 0;
        while (num != 0) {
            ctr++;
            num /= 10;
        }
        return ctr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Karatsuba Multiplication Algorithm Test\n");
        Karatsuba kts = new Karatsuba();
        System.out.println("Enter two integer numbers\n");
        long n1 = scan.nextLong();
        long n2 = scan.nextLong();
        long product = kts.multiply(n1, n2);
        System.out.println("\nProduct : " + product);
    }
}