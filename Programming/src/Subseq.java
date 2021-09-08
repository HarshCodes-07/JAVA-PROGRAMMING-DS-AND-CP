import java.math.BigInteger;
import java.util.*;

class Subseq {
    static void printSubsequences(int n, int[] arr) {
        /* Number of subsequences is (2**n -1)*/
        int opsize = (int) Math.pow(2, n);
        int[] freq = new int[n];
        /* Run from counter 000..1 to 111..1*/
        ArrayList<Integer> a = new ArrayList<>();
        for (int counter = 1; counter < opsize; counter++) {
            int min = Integer.MAX_VALUE;
            a = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if (BigInteger.valueOf(counter).testBit(j)) {
                    //       System.out.print(arr[j] + " ");
                    a.add(arr[j]);
                }
            }
            int[] temp=new int[a.size()];
            for(int i=0;i<a.size();i++)
                temp[i]=a.get(0);
            int m=mostFrequent(temp,temp.length);
            freq[m-1]++;
        }
           for (int i = 0; i < n; i++)
             System.out.print(freq[arr[i] - 1] + " ");
    }

    // Driver method to test the above function 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0;
        if (sc.hasNext())
            t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            printSubsequences(a.length, a);
            System.out.println();
        }
    }

    static int mostFrequent(int arr[], int n) {

        // Insert all elements in hash
        Map<Integer, Integer> hp =
                new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {
            int key = arr[i];
            if (hp.containsKey(key)) {
                int freq = hp.get(key);
                freq++;
                hp.put(key, freq);
            } else {
                hp.put(key, 1);
            }
        }

        // find max frequency.
        int max_count = 0, res = -1;

        for (Map.Entry<Integer, Integer> val : hp.entrySet()) {
            if (max_count < val.getValue()) {
                res = val.getKey();
                max_count = val.getValue();
            }else if (max_count==val.getValue() && val.getKey()<res){
                res = val.getKey();
                max_count = val.getValue();
            }
        }

        return res;
    }
} 