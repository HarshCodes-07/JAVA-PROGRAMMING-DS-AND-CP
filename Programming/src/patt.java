public class patt {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int x = 4,copy=i;
            for (int j = 1; j <= i; j++) {
                System.out.print(copy + " ");
                copy+=x--;
            }
            System.out.println();
        }
    }
}
