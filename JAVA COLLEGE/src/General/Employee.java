package General;

public class Employee {
    public double basic, hra, da;
    public int EmpId;
    public String Ename;

    public double earnings() {
        da = basic * 0.8;
        hra = basic * 0.15;
        return basic + da + hra;
    }
}
