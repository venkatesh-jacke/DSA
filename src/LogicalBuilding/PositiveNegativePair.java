package LogicalBuilding;

import java.util.*;
import java.util.ArrayList;


//https://www.naukri.com/code360/problems/positive-negative-pair_981311?leftPanelTabValue=PROBLEM
public class PositiveNegativePair {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(-1, 1, -4, 4, -8, 8, -9, 9));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(1, -3, 2, 3, 6, -1));
        ArrayList<Integer> arr3 = new ArrayList<>(Arrays.asList(1, 2));
        ArrayList<Integer> arr4 = new ArrayList<>(Arrays.asList(1, 2));
        System.out.println(pairs2(arr, arr.toArray().length));

    }

    public static ArrayList<ArrayList<Integer>> pairs(ArrayList<Integer> arr, int n) {
        ArrayList<ArrayList<Integer>> pairs = new ArrayList<>();
        Collections.sort(arr);
        int positive = 0;
        for (; positive < n; positive++) {
            if (arr.get(positive) > 0) break;
        }
        if (positive == 0) return pairs;
        int negative = positive - 1;

        while (negative >= 0 && positive < n) {
            if (arr.get(positive) + arr.get(negative) == 0) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(arr.get(negative));
                pair.add(arr.get(positive));
                pairs.add(pair);
                positive++;
                negative--;
            } else {
                positive++;
            }
        }
        return pairs;
    }

    public static ArrayList<ArrayList<Integer>> pairs2(ArrayList<Integer> arr, int n) {
        ArrayList<ArrayList<Integer>> pairs = new ArrayList<>();
        Collections.sort(arr);
        for (int i = 0; i < n; i++) {
            if (arr.get(i) > 0 && Collections.binarySearch(arr, -arr.get(i)) >= 0) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(-arr.get(i));
                pair.add(arr.get(i));
                pairs.add(pair);
            }
        }
        return pairs;
    }

}
