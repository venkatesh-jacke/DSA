import javafx.util.Pair;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        String s = "acfgbd";
        int k = 2;
        System.out.println(longestIdealString(s, k));
    }

    static public int longestIdealString(String s, int k) {
        int[] dp = new int[26];
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int element = s.charAt(i) - 'a';
            //left limit
            for (int j = element; j >= 0 && j >= element - k; j--) {
                if (j == element && dp[element] == 0) {
                    dp[element] = 1;
                    continue;
                }
                dp[element] = Math.max(dp[element], dp[j]+1);
            }

            //right limit
            for (int j = element + 1; j < 26 && j <= element + k; j++) {
                dp[element] = Math.max(dp[element],  dp[j]+1);
            }
            ans = Math.max(ans, dp[element]);
        }
        return ans;
    }

}
