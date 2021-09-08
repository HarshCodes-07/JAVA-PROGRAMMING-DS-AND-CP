public class CutRod {

    //Dynamic Programming Approach
    private static int cutRod(int[] price, int size) {
        int[] value = new int[size + 1];
        value[0] = 0;
        for (int i = 1; i <= size; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < i; j++) {
                max = Math.max(max, price[j] + value[i - j - 1]);
                value[i]=max;
            }
        }
        return value[size];
    }
    // Recursive Approach
    /*  private static int cutRod(int[] price, int size) {
        if (size <= 0)
            return 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            max = Math.max(max, price[i] + cutRod(price, size - i - 1));
        }
        return max;
    }
   */

    public static void main(String args[]) {
        int[] arr = new int[]{1, 5, 8, 9, 10, 17, 17, 20};
        int size = arr.length;
        System.out.println("Maximum Obtainable Value is " +
                cutRod(arr, size));

    }
}
