package gfg;

import java.util.*;


//https://www.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1

public class CountDistinct {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;
        System.out.println(countDistinct2(arr, k));
    }

    static ArrayList<Integer> countDistinct(int arr[], int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        //Calculate first window
        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        ans.add(map.size());

        //Calculate remaining window
        for (int i = k; i < arr.length; i++) {
            int out = arr[i - k];
            if (map.get(out) == 1) map.remove(out);
            else map.put(out, map.getOrDefault(out, 0) - 1);
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            ans.add(map.size());
        }
        return ans;
    }
    static ArrayList<Integer> countDistinct2(int[] arr, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int n = arr.length;

        // Single pass to calculate the distinct count for each window
        for (int i = 0; i < n; i++) {
            // Add the current element to the frequency map
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);

            // Remove the outgoing element when the window exceeds size k
            if (i >= k) {
                int outgoing = arr[i - k];
                freqMap.put(outgoing, freqMap.get(outgoing) - 1);
                if (freqMap.get(outgoing) == 0) freqMap.remove(outgoing);
            }

            // Add the distinct count to the result when the window reaches size k
            if (i >= k - 1) {
                result.add(freqMap.size());
            }
        }

        return result;
    }
}
