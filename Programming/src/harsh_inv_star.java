public class harsh_inv_star {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7 - i + 1; j++) {
                if (i == 1 || j == 1 || j == 7-i+1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
