package gfg;

import java.util.*;

//https://www.geeksforgeeks.org/problems/subarrays-with-sum-k/1

public class CountSubarrays {
    public static void main(String[] args) {
        int[] arr = {10, 2, -2, -20, 10};
        int k = -10;
        System.out.println(countSubarrays(arr, k));
    }

    static public int countSubarrays(int arr[], int k) {
        // code here
        int ans = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i : arr) {
            sum += i;
            int diff = sum - k;
            ans += map.getOrDefault(diff, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
}
