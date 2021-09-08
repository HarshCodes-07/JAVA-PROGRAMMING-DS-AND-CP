import java.util.Vector;

public class EffectivePrimeFactorization {
    private static final int MAX = 100001;
    private static final int[] spf = new int[MAX];

    private static void sieve() {
        spf[1] = 1;
        for (int i = 2; i < MAX; i++) {
            spf[i] = i;
        }
        for (int i = 4; i < MAX; i += 2)
            spf[i] = 2;
        for (int i = 3; i * i < MAX; i++) {
            if (spf[i] == i) {
                for (int j = i * i; j < MAX; j += i) {
                    if (spf[j] == j) {
                        spf[j] = i;
                    }
                }
            }
        }
    }

    private static Vector<Integer> getFactorization(int x) {
        Vector<Integer> ret = new Vector<>();
        while (x != 1) {
            ret.add(spf[x]);
            x = x / spf[x];
        }
        return ret;
    }

    public static void main(String[] args) {
        // precalculating Smallest Prime Factor
        sieve();
        int x = 12246;
        System.out.print("prime factorization for " + x + " : ");
        // calling getFactorization function
        Vector<Integer> p = getFactorization(x);
        for (Integer integer : p) System.out.print(integer + " ");
        System.out.println();
    }
}
