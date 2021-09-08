package Ayush;

import java.util.Scanner;

interface inter {
    void earning();

    void deduction();

    void bonus();
}

public class Technical implements inter {
    int Employee_ID;
    int salary;

    static Technical e = new Technical();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter Employee ID for Technical : ");
        e.Employee_ID = sc.nextInt();
        System.out.println("Enter Basic Salary for Technical : ");
        e.salary = sc.nextInt();
        e.earning();
        e.deduction();
        e.bonus();
        System.out.println("Total Salary of Emp " + e.Employee_ID + " Technical : " + e.salary);
    }

    @Override
    public void earning() {
        System.out.println("Enter the earning of Technical Employee ID : " + e.Employee_ID);
        e.salary += sc.nextInt();
    }

    @Override
    public void deduction() {
        // Assuming 5 percent Deduction
        e.salary -= (e.salary) / 5;
    }

    @Override
    public void bonus() {
        // No bonus for technical guy
    }
}
