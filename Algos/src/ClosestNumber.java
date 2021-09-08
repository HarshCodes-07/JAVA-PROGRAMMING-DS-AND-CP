public class ClosestNumber {
    public static void main(String[] args) {
        int[] arr = {101, 202, 409, 500, 601, 610, 890, 900};
        int target = 550;
        System.out.println(findClosest(arr, target));
    }

    private static int findClosest(int[] arr, int target) {
        int n = arr.length;
        if (target <= arr[0]) {
            return arr[0];
        }
        if (target >= arr[n - 1]) {
            return arr[n - 1];
        }
        int i = 0, j = n, mid = 0;
        while (i < j) {
            mid = (i + j) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            }
            if (arr[mid] > target) {
                if (mid > 0 && arr[mid - 1] < target) {
                    if (Math.abs(arr[mid - 1] - target) > Math.abs(arr[mid] - target)) {
                        return arr[mid];
                    } else {
                        return arr[mid - 1];
                    }
                }
                j = mid;
            } else {
                if (mid < n - 1 && arr[mid + 1] > target) {
                    if (Math.abs(arr[mid + 1] - target) > Math.abs(arr[mid] - target)) {
                        return arr[mid];
                    } else {
                        return arr[mid + 1];
                    }
                }
                i = mid + 1;
            }
        }
        return arr[mid];
    }
}
