import java.util.Scanner;

//q_6_7
public class Stud {
    int roll;
    int full_mark;
    int secured_mark;
    double cgpa;

    Stud(int a, int b, int c) {
        roll = a;
        full_mark = b;
        secured_mark = c;
    }

    void CGPA() {
        cgpa = (double) secured_mark / full_mark * 10;
    }

    void display() {
        CGPA();
        System.out.println("STUDENT WITH ROLL NO : " + roll + " has " + cgpa + " CGPA");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the roll,full marks and secured marks respectively : ");
        Stud s1 = new Stud(sc.nextInt(), sc.nextInt(), sc.nextInt());
        s1.display();
    }
}
