import java.util.Scanner;

public class MyVolume {
    int side;
    int l, w, h;
    double r;

    MyVolume(int x) {
        side = x;
        System.out.println("Volume = " + (side * side * side));
    }

    MyVolume(int a, int b, int c) {
        l = a;
        w = b;
        h = c;
        System.out.println("Volume = " + (l * w * h));
    }

    MyVolume(double a) {
        r = a;
        System.out.println("Voume = " + (4 / 3 * 3.14 * r * r * r));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        System.out.println("Enter 1 for cube, 2 for Cuboid, 3 for Sphere : ");
        c = sc.nextInt();
        if (c == 1) {
            System.out.println("Enter the side : ");
            MyVolume x = new MyVolume(sc.nextInt());
        } else if (c == 2) {
            System.out.println("Enter L , H , W");
            MyVolume x = new MyVolume(sc.nextInt(), sc.nextInt(), sc.nextInt());
        } else {
            System.out.println("Enter the Radius : ");
            MyVolume x = new MyVolume(sc.nextDouble());
        }
    }
}
