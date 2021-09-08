import java.util.Scanner;

public class Bank {
    int AccountNo;
    String name;
    int Balance;

    Bank(String n, int a, int b) {
        name = n;
        AccountNo = a;
        Balance = b;
    }

    private void display() {
        System.out.println("NAME = " + name);
        System.out.println("Account Number = " + AccountNo);
        System.out.println("Balance = " + Balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name , Bank Account Number and balance of 1st Person : ");
        Bank b1 = new Bank(sc.next(), sc.nextInt(), sc.nextInt());
        System.out.println("Enter name , Bank Account Number and balance of 2nd Person : ");
        Bank b2 = new Bank(sc.next(), sc.nextInt(), sc.nextInt());
        b1.display();
        b2.display();
        if (b1.Balance > b2.Balance) {
            System.out.println("Balance of 1st Person is greater.");
        } else if (b1.Balance < b2.Balance) {
            System.out.println("Balance of 2nd Person is greater.");
        } else {
            System.out.println("Both of their Balances are equal.");
        }
    }
}
