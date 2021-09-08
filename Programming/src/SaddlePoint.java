import java.util.Scanner;

public class SaddlePoint {
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
        int SaddlePoint = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                for (int k = 0; k < n; k++) {
                    min = Math.min(a[i][k], min);
                }
                for (int k = 0; k < n; k++) {
                    max = Math.max(a[k][i], max);
                }
                if (max == min && max == a[i][j]) {
                    SaddlePoint = a[i][j];
                }
            }
        }
        if (SaddlePoint == -1) {
            System.out.println("No Saddle Point Exists");
        } else {
            System.out.println("SADDLE POINT = " + SaddlePoint);
        }
    }
}
