package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintSubSets {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        


    }
   static public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        for (int bits = 0; bits < (1 << nums.length); bits++) {
            List<Integer> subset = new ArrayList<>();
            for (int j = 0; j < nums.length; j++) {
                if ((bits & (1 << j)) != 0) {
                    subset.add(nums[j]);
                }
            }
            subsets.add(subset);
        }
        return subsets;
    }
}
