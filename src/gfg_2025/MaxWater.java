package gfg_2025;

//https://www.geeksforgeeks.org/problems/trapping-rain-water-1587115621/1

public class MaxWater {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 3, 1, 0, 4};
        System.out.println(maxWater2(arr));
    }

    static public int maxWater(int arr[]) {
        // code here
        int n = arr.length;
        int ml[] = new int[n];
        int mr[] = new int[n];
        int maxLeft = 0, maxRight = 0, totalWater = 0;
        for (int i = 0; i < n; i++) {
            maxLeft = Math.max(maxLeft, arr[i]);
            ml[i] = maxLeft;
        }
        for (int i = n - 1; i >= 0; i--) {
            maxRight = Math.max(maxRight, arr[i]);
            mr[i] = maxRight;
        }
        for (int i = 0; i < n; i++) {
            totalWater += Math.max(0, Math.min(ml[i], mr[i]) - arr[i]);
        }
        return totalWater;
    }

    static public int maxWater2(int arr[]) {
        int n = arr.length;
        if (n == 0) return 0; // Edge case for empty array

        int left = 0, right = n - 1;
        int maxLeft = 0, maxRight = 0;
        int totalWater = 0;

        while (left <= right) {
            // If maxLeft is smaller, then we can decide the amount of water for arr[left]
            if (maxLeft <= maxRight) {
                totalWater += Math.max(0, maxLeft - arr[left]);
                maxLeft = Math.max(maxLeft, arr[left]);
                left++;
            }
            // If maxRight is smaller, then we can decide the amount of water for arr[right]
            else {
                totalWater += Math.max(0, maxRight - arr[right]);
                maxRight = Math.max(maxRight, arr[right]);
                right--;
            }
            System.out.println(totalWater);
        }

        return totalWater;
    }
}
