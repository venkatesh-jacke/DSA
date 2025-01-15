package gfg;


//https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1

import java.util.HashMap;

public class LongestSubarray {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, -10};
        int k = 15;
        System.out.println(longestSubarray(arr, k));
    }

    static public int longestSubarray(int[] arr, int k) {
        // code here
        int n = arr.length;
        HashMap<Long, Integer> map = new HashMap<>();
        long prefixSum = 0;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];
            if (prefixSum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }
            long diff = prefixSum-k;
            if (map.containsKey(diff)) {
                int len = i - map.get(diff);
                maxLen = Math.max(maxLen, len);

            }
            map.putIfAbsent(prefixSum, i);
        }
        //System.out.println(map);
        return maxLen;
    }



}
