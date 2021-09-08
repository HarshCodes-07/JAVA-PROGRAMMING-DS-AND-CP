public class Duplicates {
    public static void main(String[] args) {
        String s = "harsh" ;
        findDups(s);
    }

    private static void findDups(String s) {
        int[] chars = new int[26];
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i) - 97]++;
        }
        for (int i = 0; i < 26; i++) {
            if (chars[i] > 1) {
                System.out.println((char) (i + 97) + "  ->  " + chars[i]);
            }
        }
    }
}
