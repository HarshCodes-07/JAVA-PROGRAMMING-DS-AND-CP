//Write a program in Java to convert from upper case to lower case and vice versa
//of an alphabet and print the old character and new character as shown in example.
//(Ex: a-&gt;A, M-&gt;m).
import java.util.Scanner;
public class q1_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Character : ");
        char c=sc.next().charAt(0);
        if (Character.isLowerCase(c)){
            System.out.println(c+" - > "+Character.toUpperCase(c));
        }else{
            System.out.println(c+" - > "+Character.toLowerCase(c));
        }
    }
}
