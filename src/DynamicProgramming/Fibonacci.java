package DynamicProgramming;

import java.util.Arrays;

public class Fibonacci {

    static int[] memo;

    public static void main(String[] args) {
        int n = 13;
        memo = new int[n + 1];
        Arrays.fill(memo, -1);
        System.out.println(dp(n));
        System.out.println(Arrays.toString(memo));
    }


    //Recursion
    static int rec(int n) {
        if (n == 0) return 0;
        if (n < 3) return 1;
        return rec(n - 1) + rec(n - 2);
    }


    //Top Down
    static int memo(int n) {
        if (n == 0) return 0;
        if (n < 3) return 1;
        if (memo[n] != -1) return memo[n];
        return memo[n] = memo(n - 1) + memo(n - 2);
    }


    //Bottom Up
    static int dp(int n) {
        if (n == 0 || n == 1) return 1;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
