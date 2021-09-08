public class ExtendedEuclid {
    private long gcd;
    private long x;
    private long y;

    ExtendedEuclid() {
        gcd = 0;
        x = 0;
        y = 0;
    }

    static ExtendedEuclid extendedEuclidgcd(long a, long b) {
        if (b == 0) {
            ExtendedEuclid base = new ExtendedEuclid();
            base.gcd = a;
            base.x = 1;
            base.y = 0;
            return base;
        }
        ExtendedEuclid temp = extendedEuclidgcd(b, a % b);
        ExtendedEuclid ans = new ExtendedEuclid();
        ans.gcd = temp.gcd;
        ans.x = temp.y;
        ans.y = (temp.x - ((a / b)) * temp.y);
        return ans;
    }

    public static void main(String[] args) {
        ExtendedEuclid res = extendedEuclidgcd(30, 20);
        System.out.println("GCD = " + res.gcd + "\tx = " + res.x + "\t y = " + res.y);
    }
}
