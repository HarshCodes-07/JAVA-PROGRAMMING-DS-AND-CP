package Assignement_8;

import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String str) {
        System.out.println(str);
    }
}

public class Q4 {
    static void ProcessInput() throws NegativeNumberException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = sc.nextInt();
        if (a<0){
            throw new NegativeNumberException("Exception occurred because entered number is negative.");
        }else{
            System.out.println("Not exception occurs as number is positive.");
        }
    }

    public static void main(String[] args) throws NegativeNumberException {
        ProcessInput();
    }
}
