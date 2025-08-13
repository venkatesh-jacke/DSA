package gfg_2025;

import java.util.Arrays;

//https://www.geeksforgeeks.org/problems/longest-common-subsequence-1587115620/1
public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String s1 = "ABCDGH";
        String s2 = "AEDFHR";
        System.out.println(lcs(s1, s2));
    }

    static int lcs(String s1, String s2) {
        int m=s1.length(),n=s2.length();
        int[][] memo = new int[m+1][n+1];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        return lcs_rec(s1, s2, m, n, memo);
    }

    static int lcs_rec(String s1, String s2, int m, int n, int[][] memo) {
        if (m == 0 || n == 0) return 0;
        if (memo[m][n] != -1)
            return memo[m][n];

        if (s1.charAt(m-1) == s2.charAt(n-1)) {
            return memo[m][n] = 1 + lcs_rec(s1, s2, m - 1, n - 1, memo); //decrement both side
        }
            //exclude last char of both s1 and s2 take the max
            return memo[m][n] = Math.max(lcs_rec(s1, s2, m, n - 1, memo), lcs_rec(s1, s2, m - 1, n, memo));

    }
}
