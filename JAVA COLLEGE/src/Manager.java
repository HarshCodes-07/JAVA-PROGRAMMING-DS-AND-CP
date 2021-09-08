import java.util.Scanner;

class Manager implements Salary {
    public double basic, DA, HRA;

    public Manager() {
    }

    Manager(double b) {
        this.basic = b;
    }

    public void earnings() {
        DA = 0.8 * basic;
        HRA = 0.15 * basic;
        System.out.println("Earning are : " + (basic + DA + HRA));
    }

    public void deductions() {
        System.out.println("Deductions are : " + (0.12 * basic));
        basic = basic * 0.15;
    }

    public void bonus() {
    }
}

class subStaff extends Manager {
    subStaff(double b) {
        super();
        this.basic = b;
    }

    public void bonus() {
        System.out.println("Bonus is : " + (0.5 * basic));
        basic += basic * 0.5;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the basic salary of the manager : ");
        Manager mg = new Manager(sc.nextDouble());
        mg.earnings();
        mg.deductions();
        System.out.println("Enter the basic salary of the SubStaff : ");
        subStaff ss = new subStaff(sc.nextDouble());
        ss.earnings();
        ss.deductions();
        ss.bonus();
    }
}

interface Salary {
    public void earnings();

    public void deductions();

    public void bonus();
}