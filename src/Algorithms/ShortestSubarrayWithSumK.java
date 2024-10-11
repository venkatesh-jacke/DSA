package Algorithms;

public class ShortestSubarrayWithSumK {
    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 2, 4, 2,3};
        int k = 7;
        System.out.println(shortestSubArrayWithSumK(arr, k));
    }

    private static int shortestSubArrayWithSumK(int[] arr, int k) {

        int n = arr.length;
        int min_len = n + 1;
        int start = 0;
        int sum = 0;

        for (int end = 0; end < n; end++) {
            sum += arr[end]; // Add the current element to sum

            // Shrink the window from the start while the sum is greater than or equal to k
            while (sum >= k) {
                min_len = Math.min(min_len, end - start + 1); // Update the minimum length
                sum -= arr[start++]; // Subtract the start element and move start right
            }
        }
        return min_len != n + 1 ? min_len : 0;
    }


}

/*
Observation:-
If you see we are finding the minimum window length of arr which holds the sum K
This is like sliding window technique where we don't know thw window size initially

*/
