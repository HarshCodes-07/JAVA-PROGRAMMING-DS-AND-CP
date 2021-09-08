import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int n = arr.length;
        int x = 10;
        int result = Arrays.binarySearch(arr,x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                    + "index " + result);
    }

//    private static int binarySearch(int[] arr, int x) {
//        int l = 0, r = arr.length - 1;
//        while (l <= r) {
//            int mid = l + (r - l) / 2;
//            if (arr[mid] == x) {
//                return mid;
//            }
//            if (arr[mid] > x) {
//                r = mid - 1;
//            } else {
//                l = mid + 1;
//            }
//        }
//        return -1;
//    }
}
