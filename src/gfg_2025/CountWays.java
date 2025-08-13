package gfg_2025;

//https://www.geeksforgeeks.org/problems/count-ways-to-reach-the-nth-stair-1587115620/1

import java.util.Arrays;

public class CountWays {
    static int[] memo;

    public static void main(String[] args) {
        int n = 4;
        memo = new int[n + 1];
        Arrays.fill(memo, -1);
        System.out.println(countWays(n));
    }

    public static int countWays(int n) {
        // Base cases: If there are 0 or 1 stairs,
        // there is only one way to reach the top.
        if (n == 0 || n == 1) return 1;
        if (memo[n] != -1) return memo[n];
        //A person can reach nth stair either from (n-1)th stair or (n-2)th stair
        return memo[n] = countWays(n - 1) + countWays(n - 2);
    }

    public static int countWays_Dp(int n) {
        // your code here
        int ans = 0;
        int p1 = 1, p2 = 1;

        for (int i = 2; i <= n; i++) {
            int cur = p1 + p2;
            p1 = p2;
            p2 = cur;
        }
        return p2;
    }
}
