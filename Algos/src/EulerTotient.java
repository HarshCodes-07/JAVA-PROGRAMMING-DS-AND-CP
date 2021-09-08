public class EulerTotient {
    public static void main(String[] args) {
        int n;
        for (n = 1; n <= 10; n++)
            System.out.println("phi(" + n + ") = " + phi(n));
    }

    private static int phi(int n) {
        int result = n;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                while (n % i == 0) {
                    n /= i;
                }
                result -= result / i;
            }
        }
        if (n > 1) {
            result -= result / n;
        }
        return result;
    }
}
