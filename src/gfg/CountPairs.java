package gfg;

import java.util.Arrays;


//https://www.geeksforgeeks.org/problems/count-pairs-whose-sum-is-less-than-target/1

public class CountPairs {
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 2, 4, 1};
        int target = 5;
        System.out.println(countPairs(arr, target));
    }

    static int countPairs(int arr[], int target) {
        // Your code here
        int count = 0;
        int n = arr.length;
        Arrays.sort(arr);
        int left = 0, right = n - 1;
        while (left < right) {
            if (arr[left] + arr[right] < target) {
                count += (right - left);
                left++;
            } else {
                right--;
            }
        }

        return count;
    }
}
