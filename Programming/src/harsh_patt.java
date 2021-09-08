public class harsh_patt {
    public static void main(String[] args) {
        int x = 1;
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0)
                x = 2;
            else x = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(x + " ");
                x += 2;
            }
            System.out.println();
        }
    }
}
