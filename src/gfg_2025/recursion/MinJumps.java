package gfg_2025.recursion;

import java.util.Arrays;

//https://www.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1
public class MinJumps {

    static int[] memo;

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(minJumps(arr));
    }

    public static int minJumps(int[] arr) {
        memo = new int[arr.length];
        Arrays.fill(memo, -1);
        return rec(0, arr) == Integer.MAX_VALUE ? -1 : rec(0, arr);
    }

    public static int rec(int i, int[] arr) {
        if (i >= arr.length - 1) return 0;
        if(memo[i]!=-1) return memo[i];
        int ans = Integer.MAX_VALUE;
        for (int idx = i + 1; idx <= i + arr[i]; idx++) {
            int val = rec(idx, arr);
            if (val != Integer.MAX_VALUE) {
                ans = Math.min(ans, 1 + val);
            }
        }
        return memo[i]=ans;

    }
}
