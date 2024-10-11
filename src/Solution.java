

import javafx.util.Pair;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
//        System.out.println(maximumTotalSum(new int[]{2, 3, 4, 3}));
//        System.out.println(maximumTotalSum(new int[]{15, 10}));
//        System.out.println(maximumTotalSum(new int[]{2, 2, 1}));
        System.out.println(maximumTotalSum(new int[]{6,6,6,3,7,2,6,5}));
    }

    static public long maximumTotalSum(int[] arr) {
        Arrays.sort(arr);
        long ans = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] != arr[i - 1]) {
                ans += arr[i];
            } else {
                ans += arr[i];
                arr[i - 1]--;
            }
        }
        if (arr[0] > 0) return arr[0] + ans;
        return -1;
    }


}


