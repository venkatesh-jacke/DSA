package Algorithms;

public class ShortestSubarrayWithSumK {
    public static void main(String[] args) {
        ;
        int arr[] = new int[]{1, 2, 4};
        int k =8;
        //System.out.println(bruteForce(arr, k));
        System.out.println(shortestSubarrayWithSumK(arr, k));
    }

    private static int shortestSubarrayWithSumK(int[] arr, int k) {

        int n = arr.length;
        int min_len = n + 1;
        int start = 0;
        int end = 0;
        int sum = 0;

        while (end < n) {
            while (sum <= k && end < n) {
                sum += arr[end++];
            }
            while (sum > k && start < n) {
                if (end - start < min_len) min_len = end - start;
                sum -= arr[start++];
            }

        }
        return min_len!=n+1?min_len:0;
    }


}

/*
Observation:-
If you see we are finding the minimum window length of arr which holds the sum K
This is like sliding window technique where we dont know thw window size initially

*/
