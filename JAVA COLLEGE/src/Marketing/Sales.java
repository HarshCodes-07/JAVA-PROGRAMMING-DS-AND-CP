package Marketing;

import General.Employee;

import java.util.Scanner;

public class Sales extends Employee {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e = new Employee();
        System.out.println("Enter the Sales Employees ID : ");
        e.EmpId = sc.nextInt();
        System.out.println("Enter the Sales Employees Name : ");
        e.Ename = sc.next();
        System.out.println("Enter the basic salary of the sales person : ");
        e.basic = sc.nextInt();
        double earnings = e.earnings() + tallowance(e.basic);
        System.out.println("Sales Employee ID : " + e.EmpId + " and name is : " + e.Ename);
        System.out.println("Earnings of Sales person is " + earnings);
    }

    private static double tallowance(double basic) {
        return 0.05 * basic;
    }
}
