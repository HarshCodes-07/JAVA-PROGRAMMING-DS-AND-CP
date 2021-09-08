import java.util.Scanner;

public class WashingMachine implements Motor {

    @Override
    public void run() {
        System.out.println("Running.....");
    }

    @Override
    public void consume() {
        System.out.println("Consuming.....");
    }

    public static void main(String[] args) {
        WashingMachine a = new WashingMachine();
        int n = 1;
        Scanner sc = new Scanner(System.in);
        while (n != -1) {
            System.out.println("ENTER 1 to run, 2 to consume, 3 to Check Capacity and -1 to Exit");
            n = sc.nextInt();
            if (n == 1) {
                a.run();
            } else if (n == 2) {
                a.consume();
            } else if (n == 3) {
                System.out.println("CAPACITY LEFT = " + capacity);
            }
        }
    }
}

interface Motor {
    int capacity = 10;

    public void run();

    public void consume();
}
