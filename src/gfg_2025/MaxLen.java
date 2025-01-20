package gfg_2025;

//https://www.geeksforgeeks.org/problems/largest-subarray-of-0s-and-1s/1

import java.util.*;

public class MaxLen {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 1, 0, 0};
        System.out.println(maxLen(arr));
    }

    static public int maxLen(int[] arr) {
        // Your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        int res = 0;
        int prefixSum = 0;
        for (int i = 0; i < n; i++) {
            prefixSum += (arr[i] == 0) ? -1 : 1;
            if (prefixSum == 0) res = i + 1;
            if (map.containsKey(prefixSum)) {
                res = Math.max(res, i - map.get(prefixSum));
            }
            map.putIfAbsent(prefixSum, i);

        }
        return res;
    }
}
