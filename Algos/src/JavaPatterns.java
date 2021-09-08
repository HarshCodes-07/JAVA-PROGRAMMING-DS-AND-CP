public class JavaPatterns {

    private static void printPattern1() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void printPattern2() {
        int ch = 65;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char) ch++ + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("1st Pattern");
        printPattern1();
        System.out.println();
        System.out.println();
        System.out.println("2nd Pattern");
        printPattern2();
    }
}


/* OUTPUT
1st Pattern
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *


2nd Pattern
        A
      B C
    D E F
  G H I J
K L M N O
*/
