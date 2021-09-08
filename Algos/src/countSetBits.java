public class countSetBits {
    // LOOP
    /*private static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n = n >> 1;
        }
        return count;
    }*/

    //Brian Kernighan’s Algorithm
    private static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    public static void main(String args[]) {
        int i = 9;
        System.out.println(countSetBits(i));
    }
}
