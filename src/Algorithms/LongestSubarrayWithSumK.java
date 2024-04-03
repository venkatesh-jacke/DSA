package Algorithms;

import java.util.HashMap;

public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        int arr[] = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int k = 6;

        System.out.println(longestSubarrayWithSumK1(arr, k));
        System.out.println(longestSubarrayWithSumK(arr, k));
    }

    //This works for both positive and negative values
    //Time O(n)
    //Space O(n)
    public static int longestSubarrayWithSumK1(int[] arr, long k) {
        int n = arr.length;
        long sum = 0;
        int max_len = -1;
        HashMap<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == k) max_len = Math.max(max_len, i + 1);
            long rem = sum - k;
            if (map.containsKey(rem)) {
                int len = i - map.get(rem);
                max_len = Math.max(max_len, len);
            }
            map.putIfAbsent(sum, i);  //Don't update the value we can have same sum  so we should not shrink the window size
        }
        return max_len != -1 ? max_len : 0;
    }

    public static int longestSubarrayWithSumK(int[] arr, long k) {
        int n = arr.length;
        long sum = 0;
        int max_len = -1;
        int start = 0, end = 0;

        while (end < n) {
            while (sum < k && end < n) {
                sum += arr[end++];
            }
            while (sum > k && start < n) {
                sum -= arr[start++];
            }
            if(sum==k){
                max_len=Math.max(max_len,end-start);
            }
        }
        return max_len;

    }
}



/*
Note:-
1. If I have only positive numbers in my array i can do it in constant space by eliminating the hashmap and use two pointer technique
    will maintain a window size (sliding window) since if all are +ve values the cumulative sum will be in increasing order.


*/
