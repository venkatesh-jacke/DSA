package gfg_2025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.TreeSet;

public class LongestBoundedDiffSubArray {
    public static void main(String[] args) {
        int[] arr = {15, 10, 1, 2, 4, 7, 2};
        int k = 5;
        System.out.println(longestSubArray(arr, k));
    }

    static public ArrayList<Integer> longestSubArray(int[] arr, int k) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int maxLen = 0;
        int start = 0;
        for (int left = 0, right = 0; right < arr.length; right++) {
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);
            while (map.lastKey() - map.firstKey() > k) {
                int count = map.get(arr[left]);
                if (count == 1) map.remove(arr[left]);
                else map.put(arr[left], count - 1);
                left++;
            }
            if (right - left + 1 > maxLen) {
                maxLen = right - left + 1;
                start = left;
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = start; i < start + maxLen; i++) {
            result.add(arr[i]);
        }
        return result;
    }
}
