package gfg_2025;

import javafx.util.Pair;

import java.util.Arrays;
import java.util.PriorityQueue;

//https://www.geeksforgeeks.org/problems/minimum-platforms-1587115620/1
public class FindPlatform {
    public static void main(String[] args) {
        int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
        System.out.println(findPlatform(arr, dep));
    }

    public static int findPlatform(int arr[], int dep[]) {
        int n = arr.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            // Initially one platform is needed
            int cnt = 1;
            for (int j = 0; j < n; j++) {
                if (i != j)
                    // Increment cnt if trains have overlapping i-currentTrain j-other train
                    if (arr[i] >= arr[j] && dep[j] >= arr[i]) {
                        cnt++;
                    }
            }

            // Update the result
            res = Math.max(cnt, res);
        }
        return res;
    }
}
