public class PatternSearch {
    public static void main(String[] args) {
        String txt = "AABAACAADAABAAABAA";
        String pat = "AABA";
        search(txt, pat);
    }

    private static void search(String txt, String pat) {
        int i = 0, j = 0, n = txt.length(), m = pat.length();
        for (i = 0; i < n - m; i++) {
            for (j = 0; j < m; j++) {
                if (txt.charAt(i + j) != pat.charAt(j))
                    break;
            }
            if (j == m)
                System.out.println("Pattern found at index " + i);
        }
    }
}