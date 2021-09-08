package Assignement_8;

import java.util.Scanner;

class HrsException extends Exception {
    public HrsException(String str) {
        System.out.println(str);
    }
}

class MinException extends Exception {
    public MinException(String str) {
        System.out.println(str);
    }
}

class SecException extends Exception {
    public SecException(String str) {
        System.out.println(str);
    }
}

public class Q5 {
    public static void main(String[] args) throws HrsException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the hours : ");
        int hh = sc.nextInt();
        System.out.println("Enter the minutes : ");
        int mm = sc.nextInt();
        System.out.println("Enter the seconds : ");
        int ss = sc.nextInt();
        if (hh < 0 || hh > 24) {
            throw new HrsException("Exception occurred because entered hour is not Possible.");
        }
        if (mm < 0 || mm > 60) {
            throw new HrsException("Exception occurred because entered minute is not Possible.");
        }
        if (ss < 0 || ss > 60) {
            throw new HrsException("Exception occurred because entered second is not Possible.");
        }
        System.out.println("Time given is : " + hh + " : " + mm + " : " + ss);
    }
}
