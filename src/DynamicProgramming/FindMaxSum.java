package DynamicProgramming;

//https://www.geeksforgeeks.org/problems/stickler-theif-1587115621/1

public class FindMaxSum {
    public static void main(String[] args) {
        int[] arr = {6, 5, 5, 7, 4};
        System.out.println(findMaxSum(arr));
    }

    public static int findMaxSum(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n + 1];
        dp[0] = 0; //No house
        dp[1] = arr[0]; //only one house
        for (int i = 2; i <= n; i++) {
            int take = arr[i - 1] + dp[i - 2];
            int notTake = arr[i - 1];
            dp[i] = Math.max(take, notTake);
        }
        return dp[n];
    }

}
