public class MaximumSumIncreasingSubsequence {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 101, 2, 3, 100, 4, 5};
        int n = arr.length;
        System.out.println("Sum of maximum sum " +
                "increasing subsequence is " +
                maxSumIS(arr, n));
    }

    private static int maxSumIS(int[] arr, int n) {
        int[] maxSeq = new int[n];
        if (n >= 0) System.arraycopy(arr, 0, maxSeq, 0, n);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && maxSeq[i] < maxSeq[i] + maxSeq[j])
                    maxSeq[i] = arr[i] + maxSeq[j];
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (maxSeq[i] > max)
                max = maxSeq[i];
        }
        return max;
    }
}
