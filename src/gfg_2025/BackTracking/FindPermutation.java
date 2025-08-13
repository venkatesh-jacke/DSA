package gfg_2025.BackTracking;

import java.util.*;


//https://www.geeksforgeeks.org/problems/permutations-of-a-given-string2041/1
public class FindPermutation {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(findPermutation(str));
    }

    static public ArrayList<String> findPermutation(String s) {

        HashSet<String> set = new HashSet<>();
        permutation(s.toCharArray(), 0, set);
        return new ArrayList<>(set);
    }

    static public void permutation(char[] ca, int idx, HashSet<String> set) {
        if (idx == ca.length - 1) {
            set.add(String.valueOf(ca));
        } else {
            for (int i = idx; i < ca.length; i++) {
                swap(ca, i, idx);
                permutation(ca, idx + 1, set);
                swap(ca, i, idx);
            }
        }
    }

    static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
