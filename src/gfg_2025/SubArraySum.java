package gfg_2025;

import java.util.*;


//https://www.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1
public class SubArraySum {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 4};
        int target = 5;
        System.out.println(subarraySum(arr, target));
    }

    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        int n = arr.length;
        int sum = 0;
        for (int left = 0, right = 0; right < n; right++) {
            sum += arr[right];
            while (sum > target && left < right) {
                sum -= arr[left];
                left++;
            }
            if (sum == target) {
                return new ArrayList<>(Arrays.asList(left + 1, right + 1));
            }
        }
        return new ArrayList<>(Collections.singletonList(-1));
    }
}
