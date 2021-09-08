import java.util.Arrays;
import java.util.Scanner;

public class CountingSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the Maximum Range :");
        int k = sc.nextInt();
        System.out.println(Arrays.toString(a));
        int[] output = new int[n];
        output = countingSort(a, k);
        System.out.println(Arrays.toString(output));
    }

    private static int[] countingSort(int[] a, int k) {
        int[] output = new int[a.length];
        int[] freq = new int[k + 1];
        for (int value : a) {
            freq[value]++;
        }
        for (int i = 1; i < k + 1; i++) {
            freq[i] += freq[i - 1];
        }
        for (int i = a.length - 1; i >= 0; i--) {
            output[freq[a[i]]-- - 1] = a[i];
        }
        return output;
    }
}
