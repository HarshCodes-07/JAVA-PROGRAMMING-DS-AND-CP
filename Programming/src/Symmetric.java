import java.util.Scanner;

public class Symmetric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of Matrix : ");
        int n = sc.nextInt();
        System.out.println("Enter " + (n * n) + " Elements : ");
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        if (isSymmetric(a, n)) {
            System.out.println("YES, IT IS SYMMETRIC");
        } else {
            System.out.println("NO, IT IS NOT SYMMETRIC");
        }
    }

    private static boolean isSymmetric(int[][] a, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] != a[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
