package gfg_2025;

import java.util.Arrays;

//https://www.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1

public class MinJumps_II {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(minJumps(arr));
    }

    public static int minJumps(int[] arr) {
        int jumps = 0, maxEnd = 0, currentEnd = 0;
        for (int i = 0; i < arr.length; i++) {
            maxEnd = Math.max(maxEnd, +arr[i]);
            if (i == currentEnd) {
                currentEnd = maxEnd;
                jumps++;
                if (currentEnd >= arr.length - 1) break;
            }
        }
        return jumps;
    }


}
