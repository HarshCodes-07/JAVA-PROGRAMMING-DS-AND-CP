import java.util.Iterator;
import java.util.PriorityQueue;

class NearlySorted {
    private static void kSort(int[] arr, int n, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k + 1; i++) {
            pq.add(arr[i]);
        }
        int index = 0;
        for (int i = k + 1; i < n; i++) {
            arr[index++] = pq.poll();
            pq.add(arr[i]);
        }
        Iterator<Integer> i = pq.iterator();
        while (i.hasNext()) {
            arr[index++] = pq.poll();
        }
    }

    private static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        int k = 3;
        int[] arr = {2, 6, 3, 12, 56, 8};
        int n = arr.length;
        kSort(arr, n, k);
        System.out.println("Following is sorted array");
        printArray(arr, n);
    }
}