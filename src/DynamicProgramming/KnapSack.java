package DynamicProgramming;

//https://www.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1

import java.util.Arrays;

public class KnapSack {


    public static void main(String[] args) {
        int w = 4;
        int[] val = {1, 2, 3};
        int[] wt = {4, 5, 1};
        System.out.println(knapSack2(w, val, wt));
    }

    //2D Array
    public static int knapSack(int w, int[] val, int[] wt) {
        int n = val.length;
        int[][] dp = new int[n + 1][w + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= w; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else {
                    int take = 0;
                    //i-1 is current item
                    if (wt[i - 1] <= j) {  // Check if item fits
                        take = val[i - 1] + dp[i - 1][j - wt[i - 1]];
                    }
                    int notTake = dp[i - 1][j];
                    dp[i][j] = Math.max(take, notTake);
                }
            }
        }
        return dp[n][w];
    }

    //1D Array
    public static int knapSack2(int w, int[] val, int[] wt) {
        int n = val.length;
        int[] dp = new int[w + 1];

        //Backward iteration
        for (int i = 0; i < wt.length; i++) { // Iterate over items
            for (int j = w; j >= wt[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - wt[i]] + val[i]);
            }
            System.out.println("After considering item " + (i + 1) + ": " + Arrays.toString(dp));
        }
        return dp[w];
    }

}
