package gfg_2025;

import java.util.*;


//https://www.geeksforgeeks.org/problems/pair-in-array-whose-sum-is-closest-to-x1124/1

public class SumClosest {
    public static void main(String[] args) {
        int[] arr = {10, 30, 20, 5};
        int target = 25;
        System.out.println(sumClosest(arr, target));
    }

    static public List<Integer> sumClosest(int[] arr, int target) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        int closestDiff = Integer.MAX_VALUE, maxAbsDiff = Integer.MIN_VALUE;
        List<Integer> res = new ArrayList<>();
        int left = 0, right = n - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            int diff = Math.abs(target - sum);
            if (diff < closestDiff || (diff == closestDiff && Math.abs(arr[left] - arr[right]) > maxAbsDiff)) {
                closestDiff = diff;
                maxAbsDiff=Math.abs(arr[left]-arr[right]);
                res = Arrays.asList(Math.min(arr[left], arr[right]), Math.max(arr[left], arr[right]));
            }
            if (sum < target) left++;
            else right--;
        }

        return res;
    }
}
