public class KClosest {
    public static void main(String[] args) {
        KClosest ob = new KClosest();
        int[] arr = {12, 16, 22, 30, 35, 39, 42,
                45, 48, 50, 53, 55, 56
        };
        int n = arr.length;
        int x = 35, k = 4;
        System.out.println("The Closest " + k + " Elements to " + x + " are :--- ");
        ob.printKclosest(arr, x, 4, n);
    }

    private void printKclosest(int[] arr, int x, int k, int n) {
        int l = findCrossover(arr, x, n, 0, n - 1);
        int r = l + 1;
        int count = 0;
        if (arr[l] == x)
            l--;
        while (l >= 0 && r < n && count < k) {
            if (x - arr[l] < arr[r] - x)
                System.out.print(arr[l--] + " ");
            else
                System.out.print(arr[r++] + " ");
            count++;
        }
        while (count < k && l >= 0) {
            System.out.print(arr[l] + " ");
            count++;
        }
        while (count < k && r <= n - 1) {
            System.out.print(arr[r] + " ");
            count++;
        }
    }

    private int findCrossover(int[] arr, int x, int n, int left, int right) {
        if (arr[right] <= x)
            return right;
        if (arr[left] > x)
            return left;
        int mid = (left + right) / 2;
        if (arr[mid] <= x && arr[mid + 1] > x)
            return mid;
        else if (arr[mid] > x)
            return findCrossover(arr, x, n, left, mid - 1);
        return findCrossover(arr, x, n, mid + 1, right);
    }
}
