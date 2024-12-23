package Algorithms;

import java.util.HashMap;

public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        int arr1[] = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int arr2[] = new int[]{1, 4, 2, 1, 4};
        int k = 6;

        System.out.println(longestSubArrayWithSumK1(arr1, k));
       // System.out.println(longestSubArrayWithSumK2(arr2, k));
    }

    //This works for both positive and negative values
    //Time O(n)
    //Space O(n)
    public static int longestSubArrayWithSumK1(int[] arr, long k) {
        int n = arr.length;
        long sum = 0;
        int max_len = -1;
        HashMap<Long, Integer> map = new HashMap<>();
        map.put(0L,1); //consider the subArray starts from 0
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


    //Works only for Positive Values
    public static int longestSubArrayWithSumK2(int[] arr, long k) {
        int n = arr.length;
        long sum = 0;
        int max_len = -1;
        int start = 0;

        for (int end = 0; end < n; end++) {
            sum += arr[end]; // Add the current element to the sum

            // Shrink the window from the left as long as the sum is at least k
            while (sum > k && start <= end) {
                sum -= arr[start++]; // Shrink the window from the start
            }

            // If the sum is exactly k, update max_len
            if (sum == k) {
                max_len = Math.max(max_len, end - start + 1);
            }
        }
        return max_len != -1 ? max_len : 0;

    }
}



/*
Note:-
1. If I have only positive numbers in my array i can do it in constant space by eliminating the hashmap and use two pointer technique
    will maintain a window size (sliding window) since if all are +ve values the cumulative sum will be in increasing order.


*/
