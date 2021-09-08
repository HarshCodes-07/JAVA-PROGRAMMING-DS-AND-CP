import java.util.Scanner;

public class MatrixMult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of 1st Matrix : ");
        int n = sc.nextInt();
        System.out.println("Enter " + (n * n) + " Elements : ");
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the number of rows and columns of 2nd Matrix : ");
        int m = sc.nextInt();
        System.out.println("Enter " + (m * m) + " Elements : ");
        int[][] b = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        int[][] c = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < m; k++)
                    c[i][j] += (a[i][k] * b[k][j]);
            }
        }
        System.out.println("GIVEN MATRIX : ");
        System.out.println("A :  ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("B :  ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("RESULTANT MATRIX :  ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
