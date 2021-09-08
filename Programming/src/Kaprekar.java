public class Kaprekar {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (isKaprekar(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isKaprekar(int n) {
        StringBuilder s1 = new StringBuilder();
        String s2 = Integer.toString(n * n);
        for (int i = 0; i < s2.length() - 1; i++) {
            s1.append(s2.charAt(0));
            s2 = s2.substring(1);
            int a = Integer.parseInt(String.valueOf(s1));
            int b = Integer.parseInt(s2);
            if (a + b == n) {
                return true;
            }
        }

        return false;
    }
}
