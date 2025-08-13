package gfg_2025.recursion;

import java.util.Arrays;

//https://www.geeksforgeeks.org/problems/stickler-theif-1587115621/1
public class FindMaxSum {

    static int[] memo;
    public static void main(String[] args) {
        int[] arr = {6, 5, 5, 7, 4};


        System.out.println(findMaxSum(arr));
    }

    public static int findMaxSum(int[] arr) {
        memo= new int[arr.length+2];
        Arrays.fill(memo,-1);
        return rec(0,arr);
    }


    public static int rec(int i, int[] arr) {
        if (i >= arr.length) return 0; // Base case: Out of bounds
        if(memo[i]!=-1) return memo[i];

        // Take current element and skip next one
        int take = arr[i] + rec(i + 2, arr);

        // Skip current element
        int notTake = rec(i + 1, arr);

        return memo[i]=Math.max(take, notTake);
    }
}
