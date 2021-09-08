import java.util.Scanner;
// 6 _ 3
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length , height and width respectively : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Box ob = new Box(a, b, c);
        System.out.println(ob.Volume());
    }
}
