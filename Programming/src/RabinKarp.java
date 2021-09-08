// Below is the implementation of a string matching algorithm using hashing
public class RabinKarp {
    //No of Possible Characters
    private final static int d = 256;

    private static void search(String txt, String pat, int q) {
        int m = pat.length();
        int n = txt.length();
        int i, j;
        int p = 0; // hash value for pattern
        int t = 0; // hash value for text
        int h = 1;
        // h = ( pow ( d , m - 1 ) % q
        for (i = 0; i < m - 1; i++)
            h = (h * d) % q;
        // calculate hash value of pattern and first substring of txt
        for (i = 0; i < m; i++) {
            p = (d * p + pat.charAt(i)) % q;
            t = (d * t + txt.charAt(i)) % q;
        }
        // Keep Sliding
        for (i = 0; i < n - m; i++) {
            // Check the hash values of current window of text
            // and pattern. If the hash values match then only
            // check for characters on by one
            if (p == t) {
                for (j = 0; j < m; j++) {
                    if (txt.charAt(i + j) != pat.charAt(j))
                        break;
                }
                if (j == m) {
                    System.out.println("Pattern found at index " + i);
                }
            }
            // Calculate hash value for next window of text: Remove
            // leading digit, add trailing digit
            if (i < n - m) {
                t = (d * (t - txt.charAt(i) * h) + txt.charAt(i + m)) % q;
            }
            // in case you get negative value
            if (t < 0)
                t += q;
        }
    }

    public static void main(String[] args) {
        String txt = "GEEKS FOR GEEKS";
        String pat = "GEEK";
        int q = 101;// A prime number
        search(txt, pat, q);
    }
}
