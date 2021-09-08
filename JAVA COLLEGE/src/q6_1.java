import java.util.Scanner;

public class q6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        int o = Integer.parseInt(args[2]);
        System.out.println("LARGEST IS : " + Math.max(Math.max(n, m), o));
    }
}
