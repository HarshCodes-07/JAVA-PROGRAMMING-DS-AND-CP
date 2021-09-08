import java.util.*;

// Rectangle Class File 
public class Rectangle {

    double length;
    double width;
    double area;
    double perimeter;

    Rectangle(int a, int b) {
        length = a;
        width = b;
    }

    void Area() {
        area = this.length * this.width;
    }

    void Perimeter() {
        perimeter = 2 * (this.length + this.width);
    }

    void calculate() {
        Area();
        Perimeter();
    }

    void display() {
        calculate();
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length and breadth : ");
        Rectangle r = new Rectangle(sc.nextInt(), sc.nextInt());
        r.display();
    }
}

