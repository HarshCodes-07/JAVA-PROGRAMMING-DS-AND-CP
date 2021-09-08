import java.util.*;

class six {
    static void arg(int a[]) throws CheckArgs {
        throw new CheckArgs("Input arguements less than 4");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter a number or type done to exit : ");
            String num = sc.nextLine();
            if (num.equals("done")) {
                try {
                    arg(a);
                } catch (Exception e) {
                    System.out.println(e);
                } finally {
                    System.exit(0);
                }
            }
            a[i] = Integer.parseInt(num);
        }
        System.out.print("Argumets not less than 4 so sum of squares of numbers = ");
        int sum = 0;
        for (int i = 0; i < 4; i++)
            sum += (a[i] * a[i]);
        System.out.println(sum);
    }
}

class CheckArgs extends Exception {
    CheckArgs(String s) {
        super(s);
    }
}