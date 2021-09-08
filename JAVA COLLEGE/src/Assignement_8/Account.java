package Assignement_8;

import java.util.Scanner;

class LowBalanceException extends Exception {
    public LowBalanceException(String str) {
        System.out.println(str);
    }
}

public class Account {
    static Scanner sc = new Scanner(System.in);
    int balance = 500;

    void withdraw() throws LowBalanceException {
        System.out.println("Enter the amount to withdraw : ");
        int x = sc.nextInt();
        if (x > balance) {
            throw new LowBalanceException("Insufficient Balance....");
        } else {
            System.out.println("Amount withdrawn.....");
            balance -= x;
        }
    }

    void deposit() {
        System.out.println("Enter the amount to Deposit : ");
        int x = sc.nextInt();
        balance += x;
        System.out.println("Amount deposited.....");
    }

    public static void main(String[] args) throws LowBalanceException {
        Account user = new Account();
        while (true) {
            System.out.println("Enter 1 To Deposit : ");
            System.out.println("Enter 2 To Withdraw : ");
            System.out.println("Enter 3 To Check Balance : ");
            System.out.println("Enter 4 To Exit : ");
            int ch = sc.nextInt();
            if (ch == 1) {
                user.deposit();
            } else if (ch == 2) {
                user.withdraw();
            } else if (ch == 3) {
                System.out.println("Balance is : " + user.balance);
            } else {
                break;
            }
        }
    }
}
