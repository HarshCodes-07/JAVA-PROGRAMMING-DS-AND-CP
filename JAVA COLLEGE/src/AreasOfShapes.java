import java.util.Scanner;

class AreasOfShapes {
    void Area(float x) {
        System.out.println("Area of the square: " + x * x + " sq units");
    }

    void Area(float x, float y) {
        System.out.println("Area of the rectangle: " + x * y + " sq units");
    }

    void Area(double r) {
        double area = 3.14 * r * r;
        System.out.println("Area of the circle: " + area + " sq units");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = 0;
        System.out.println("Enter 1 for square , 2 for circle , 3 for rectangle : ");
        ch = sc.nextInt();
        if (ch == 1) {
            AreasOfShapes x = new AreasOfShapes();
            System.out.println("Enter the side : ");
            x.Area(sc.nextFloat());
        } else if (ch == 2) {
            AreasOfShapes x = new AreasOfShapes();
            System.out.println("Enter the radius : ");
            x.Area(sc.nextDouble());
        } else {
            AreasOfShapes x = new AreasOfShapes();
            System.out.println("Enter the length and breadth : ");
            x.Area(sc.nextFloat(), sc.nextFloat());
        }
    }
}