import java.lang.*;

class ActivitySelection {
    public static void printMaxActivities(int s[], int f[], int n) {
        int i, j;

        System.out.print("Following activities are selected : n");
        int last = 0;
        for (i = 0; i < n; i++) {
            if (s[i] > last) {
                System.out.print(i + " ");
                last = f[i];
            }
        }
    }

    public static void main(String[] args) {
        int[] s = {1, 3, 0, 5, 8, 5};
        int[] f = {2, 4, 6, 7, 9, 9};
        int n = s.length;

        printMaxActivities(s, f, n);
    }
}
