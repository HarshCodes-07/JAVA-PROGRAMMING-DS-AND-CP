public class power {
    private static int mod = 1000000007;

    //FAST EXPONENTIATION
    private static long power(int a, int n) {
        if (n == 0) return 1 % mod;
        if (n % 2 == 0) {
            long half_ans = (power(a, n / 2));
            return ((half_ans % mod) * (half_ans % mod)) % mod;
        } else {
            long half_ans = (power(a, n / 2));
            return ((half_ans % mod) * (half_ans % mod) * (a % mod)) % mod;
        }
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 10;

        System.out.println("Power is " +
                power(x, y));
    }
}
