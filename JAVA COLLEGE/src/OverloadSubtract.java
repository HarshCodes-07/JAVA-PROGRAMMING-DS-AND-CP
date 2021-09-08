import java.util.Scanner;

public class OverloadSubtract {
    static void subtract(int a, int b) {
        System.out.println(a - b);
    }

    static void subtract(double a, double b) {
        System.out.println(a - b);
    }

    static void subtract(float a, float b) {
        System.out.println(a - b);
    }

    static void subtract(long a, long b) {
        System.out.println(a - b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for int , 2 or double , 3 for float , 4 for time : ");
        int c = sc.nextInt();
        if (c == 1) {
            subtract(sc.nextInt(), sc.nextInt());
        } else if (c == 2) {
            subtract(sc.nextDouble(), sc.nextDouble());
        } else if (c == 3) {
            subtract(sc.nextFloat(), sc.nextFloat());
        } else {
            subtract(sc.nextLong(), sc.nextLong());
        }
    }
}
