package Assignement_8;

public class Q2 {

    public static void main(String[] args) {
        try {
            int a;
            int b = 0;
            a = 1 / b;
        } catch (Exception c) { //Here Exception is the super class
            System.out.println("Generic exception Catch");
        } //This catch is never reached becauseArithmeticExeption is a subclass of Exception.

//        catch (ArithmeticException d) { // Error - unreachable //ArithmeticException is the SubClass of exception
//
//            System.out.println("This statement is never executed");
//
//        }
        System.out.println("After try/catch Blocks");
    }

}

