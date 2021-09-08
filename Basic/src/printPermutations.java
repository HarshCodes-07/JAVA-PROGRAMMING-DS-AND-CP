import java.util.Scanner;

public class printPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        printPermutation(s);
    }

    static void printPermutation(String s) {
        permutations("", s);
    }

    private static void permutations(String perm, String word) {
        if (word.isEmpty()) {
            System.out.println(perm + word);
        } else {
            for (int i = 0; i < word.length(); i++)
                permutations(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1));
        }
    }
}
