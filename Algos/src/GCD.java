public class GCD {
    public static void main(String[] args) {
        int a = 10, b = 15, g;
        g = gcd(a, b);
        System.out.println("GCD(" + a + " , " + b + ") = " + g);

        a = 35;
        b = 10;
        g = gcd(a, b);
        System.out.println("GCD(" + a + " , " + b + ") = " + g);

        a = 36;
        b = 16;
        g = gcd(a, b);
        System.out.println("GCD(" + a + " , " + b + ") = " + g);

    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
