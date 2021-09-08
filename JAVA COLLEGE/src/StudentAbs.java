abstract class StudentAbs {
    int rollNo;
    int regNo;
    public abstract void course();
}
class kiitian extends StudentAbs{
    @Override
    public void course() {
        System.out.println("Roll NO : "+rollNo);
        System.out.println("Registration NO : "+regNo);
        System.out.println("COURSE IS BTECH, CSE");
    }

    public static void main(String[] args) {
        StudentAbs s=new kiitian();
        s.regNo=11199;
        s.rollNo=1905607;
        s.course();
    }
}
