package Assignement_10;

public class Q1 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Pramod Dash");
        String s1 = " Kumar";
        System.out.println("Given S = " + s);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                s.insert(i, s1);
                break;
            }
        }
        System.out.println("After adding substring, S = " + s);
    }
}
