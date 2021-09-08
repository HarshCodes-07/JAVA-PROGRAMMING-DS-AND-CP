public class harsh_patt2 {
    public static void main(String[] args) {
        int k = 1, x = 4;
        for (int i = 1; i <= 6; i++) {
            if (i <= 3)
                for (int j = 1; j <= i; j++) {
                    if (j == i)
                        System.out.print(k++ + " ");
                    else
                        System.out.print(k++ + "*");
                    if (k == 7)
                        k = 1;
                }
            else {
                if (i == 6)
                    System.out.print(1);
                else
                    for (int j = 1; j <= 7 - i; j++) {
                        if (j == 7 - i)
                            System.out.print(x++ + " ");
                        else
                            System.out.print(x++ + "*");
                    }
                x -= 7 - i + 2;
            }

            System.out.println();
        }

    }
}
