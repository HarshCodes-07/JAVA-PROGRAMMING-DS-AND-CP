public class HeapSort {
    private void sort(int[] arr) {
        int n = arr.length;
        for (int i = n / 2; i >= 0; i--)
            heapify(arr, n, i);
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, n, 0);
        }
    }

    private void heapify(int[] arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && arr[largest] < arr[l])
            largest = l;
        if (r < n && arr[largest] < arr[r])
            largest = r;
        if (largest != i) {
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
            heapify(arr, n, largest);
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int value : arr) System.out.print(value + " ");
        System.out.println();
    }

    // Driver program
    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{12, 11, 13, 5, 6, 7};
        int n = arr.length;

        HeapSort ob = new HeapSort();
        ob.sort(arr);

        System.out.println("Sorted array is");
        printArray(arr);
    }
}
