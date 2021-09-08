public class SieveOfEratosthenes {
    public static void main(String args[]) {
        int n = 30;
        System.out.print("Following are the prime numbers ");
        System.out.println("smaller than or equal to " + n);
        SieveOfEratosthenes g = new SieveOfEratosthenes();
        g.sieveOfEratosthenes(n);
    }

    private void sieveOfEratosthenes(int n) {
        boolean[] primes = new boolean[n + 1];
        for (int i = 2; i <= n; i++) primes[i] = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (primes[i]) {
                for (int j = i * i; j <= n; j += i) {
                    primes[j] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (primes[i])
                System.out.print(i + " ");
        }
    }
}
