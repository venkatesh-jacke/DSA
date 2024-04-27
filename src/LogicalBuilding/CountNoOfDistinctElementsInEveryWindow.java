package LogicalBuilding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class CountNoOfDistinctElementsInEveryWindow {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(0, 3, 0, 0, -3, -3, 0, 1, 2, 0, -1 - 4, 3, 2, -4));
        //ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2, 2, 1, 3));
        System.out.println(countDistinct(arr, arr.size(), 11));
    }


    //BruteForce
    //Time O(n-k *k)
    //Space O(n)
    public static ArrayList<Integer> countDistinct_Brut(ArrayList<Integer> arr, int n, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i <= n - k; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = i; j < i + k; j++) {
                set.add(arr.get(j));
            }
            res.add(set.size());
        }

        return res;
    }

    //Time O(n)
    //Space O(n)
    public static ArrayList<Integer> countDistinct(ArrayList<Integer> arr, int n, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++)
            map.put(arr.get(i), map.getOrDefault(arr.get(i), 0) + 1);
        res.add(map.size());
        for (int i = 1; i <= n - k; i++) {
            int left = arr.get(i - 1);
            int right = arr.get(i + k - 1);
            int leftFreq = map.get(left);
            if (leftFreq > 1) {
                map.put(left, leftFreq - 1);
            } else {
                map.remove(left);
            }
            map.put(right, map.getOrDefault(right, 0) + 1);
            res.add(map.size());
        }
        return res;
    }
}
