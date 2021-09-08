public class StringRotation {
    public static void main(String[] args) {
        String str1 = "ABCDEF";
        String str2 = "DEFABC";
        if (areRotations(str1, str2))
            System.out.println("Strings are rotations of each other");
        else
            System.out.println("Strings are not rotations of each other");
    }

    private static boolean areRotations(String a, String b) {
        if (a.length() != b.length())
            return false;
        String temp = a + a;
        return temp.contains(b);
    }
}
