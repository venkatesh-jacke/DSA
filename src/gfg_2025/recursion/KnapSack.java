package gfg_2025.recursion;

//https://www.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1

import java.util.Arrays;

public class KnapSack {
    static int[][] memo;

    public static void main(String[] args) {
        int w = 4;
        int[] val = {1, 2, 3};
        int[] wt = {4, 5, 1};
        System.out.println(knapSack(w, val, wt));
    }

    public static int knapSack(int w, int[] val, int[] wt) {
        int n = val.length;
        memo = new int[n + 1][w + 1];
        for (int row[] : memo) Arrays.fill(row, -1);
        return rec(w, val, wt, n);
    }

    public static int rec(int w, int[] val, int[] wt, int n) {
        if (w == 0 || n == 0) return 0;
        if (memo[n][w] != -1) return memo[n][w];
        int take = 0;
        // If the current item's weight is less than or equal to the remaining knapsack capacity
        if (wt[n - 1] <= w) {
            // Take the item: add its value and reduce the knapsack capacity
            take = val[n - 1] + rec(w - wt[n - 1], val, wt, n - 1);
        }
        // Don't take the item: move to the next item without changing the capacity
        int notTake = rec(w, val, wt, n - 1);
        return memo[n][w] = Math.max(take, notTake);
    }
}
