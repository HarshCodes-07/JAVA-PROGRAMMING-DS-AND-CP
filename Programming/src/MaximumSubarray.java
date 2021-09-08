import java.util.Arrays;
import java.util.Scanner;

public class MaximumSubarray {
    public static void main(String[] args) {
        MaximumSubarray ob = new MaximumSubarray();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        ob.moveZeroes(a);
    }

    public void moveZeroes(int[] nums) {
        int zero = -1, non_zero = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                zero = i;
            else
                non_zero = i;
            if (zero != -1 && non_zero != -1) {
                int temp = nums[zero];
                nums[zero] = nums[non_zero];
                nums[non_zero] = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

}
