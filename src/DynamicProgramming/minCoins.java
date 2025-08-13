package DynamicProgramming;

import java.util.Arrays;

//https://leetcode.com/problems/coin-change/

public class minCoins {
    public static void main(String[] args) {
        int[] coins = new int[]{1, 2, 5};
        int target = 11;
        System.out.println(minCoins(coins, target));
        System.out.println(coinChange(coins, target));
    }

        static public int minCoins(int coins[], int sum) {
            int[] dp = new int[sum + 1];
            Arrays.fill(dp, sum + 1);
            dp[0] = 0;
            for(int coin : coins) { // try for each coins
                for(int i = coin; i <=sum; i++){
                    // Step 6: Either keep the previous min value or take 1 more coin from dp[i - coin]
                    dp[i] = Math.min(dp[i], dp[i-coin]+1);
                }
            }
            return dp[sum];
        }
    static public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0]=0;
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i)
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
            }
        }
        return (dp[amount] > amount) ? -1 : dp[amount];
    }
}
