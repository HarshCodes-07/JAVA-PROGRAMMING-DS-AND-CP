package Ayush;

import java.util.Scanner;

public class Non_Technical extends Technical implements inter {
    static Scanner sc = new Scanner(System.in);
    static Non_Technical e = new Non_Technical();

    @Override
    public void earning() {
        System.out.println("Enter the earning of Non Technical Employee ID : " + e.Employee_ID);
        e.salary += sc.nextInt();
    }

    @Override
    public void deduction() {
        // Assuming 5 percent Deduction
        e.salary -= (e.salary) / 5;
    }

    @Override
    public void bonus() {
        System.out.println("Enter the bonus of Non Technical Guy : ");
        e.salary += sc.nextInt();
    }

    public static void main(String[] args) {
        System.out.println("Enter Employee ID for Non Technical : ");
        e.Employee_ID = sc.nextInt();
        System.out.println("Enter Basic Salary for Non Technical : ");
        e.salary = sc.nextInt();
        e.earning();
        e.deduction();
        e.bonus();
        System.out.println("Total Salary of Emp " + e.Employee_ID + " Non Technical : " + e.salary);
    }
}
