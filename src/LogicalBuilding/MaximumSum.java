package LogicalBuilding;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long[] arr = new long[n];

            for (int i = 0; i < n; i++) arr[i] = sc.nextLong();
            System.out.println(maximumSum(n, arr, k));
        }
    }

    static long maximumSum(int n, long[] arr, int k) {
        Arrays.sort(arr);
        long[] prefix = new long[n + 1];
        long max = 0;
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }
        // System.out.println(Arrays.toString(prefix));
        for (int i = 0; i <= k; i++) {
            //System.out.println("K = " + i);
            long a = prefix[n - k + i];
            long b = prefix[2 * i];
            // System.out.println("a = "+a+" b= "+b);
            //System.out.println("Compare "+max+" and "+(a-b));
            max = Math.max(max, a - b);
        }

        return max;
    }
}
