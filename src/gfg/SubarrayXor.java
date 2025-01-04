package gfg;

import java.util.*;


//https://www.geeksforgeeks.org/problems/count-subarray-with-given-xor/1

public class SubarrayXor {
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 6, 4};
        int k = 6;
        System.out.println(subarrayXor(arr, k));
    }

    static public long subarrayXor(int arr[], int k) {
        // code here
        int n = arr.length;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int curXor = 0;
        for (int i = 0; i < n; i++) {
            curXor ^= arr[i];
            int find = curXor ^ k;
            count += map.getOrDefault(find, 0);
            map.put(curXor, map.getOrDefault(curXor, 0) + 1);
        }
        return count;
    }
}
// The value `find = curXor ^ k` calculates the XOR value that, when XORed with the current cumulative XOR (`curXor`),
// would result in `k`. This checks if there exists a subarray (ending at the current index) whose XOR equals `k`.
// If this value has been encountered before, it means a subarray with XOR equal to `k` exists.
