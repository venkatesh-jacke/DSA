package gfg_2025;


//https://www.geeksforgeeks.org/problems/equilibrium-point-1587115620/1

import java.util.Arrays;

public class FindEquilibrium {
    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println(findEquilibrium(arr));
    }

    public static int findEquilibrium(int arr[]) {
        // code here
        int n = arr.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        int equilibrium = -1;
        for (int i = 1; i < n; i++) {
            leftSum[i] = leftSum[i - 1] + arr[i - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            rightSum[i] = rightSum[i + 1] + arr[i + 1];
        }
        System.out.println(Arrays.toString(leftSum));
        System.out.println(Arrays.toString(rightSum));
        for (int i = 1; i < n - 1; i++) {
            if (leftSum[i] == rightSum[i]) {
                equilibrium = i;
            }
        }
        return equilibrium;
    }

    public static int findEquilibrium2(int arr[]) {
        // code here
        int n = arr.length;
        int equilibrium = -1;
        int totalSum = 0;
        int leftSum = 0;
        for (int i : arr) totalSum += i;
        for (int i = 0; i < n; i++) {
            int rightSum = totalSum - leftSum - arr[i];
            if (leftSum == rightSum) return i;
            leftSum += arr[i];
        }

        return equilibrium;
    }
}
