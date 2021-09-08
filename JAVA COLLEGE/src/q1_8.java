//Write a program in Java to print even numbers between 23 and 57, each number
//should be printed in a row separated by comma(,).
public class q1_8 {
    public static void main(String[] args) {
        for (int i = 23; i <= 57; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " , ");
            }
        }
    }
}
