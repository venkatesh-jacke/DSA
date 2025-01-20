package gfg_2025;

import java.util.*;


//https://www.geeksforgeeks.org/problems/print-anagrams-together/1

public class Anagrams {
    public static void main(String[] args) {
        String[] arr = {"act", "god", "cat", "dog", "tac"};
        System.out.println(anagrams(arr));
    }

    static public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        HashMap<String,ArrayList<String>> map= new HashMap<>();
        for(String str:arr){
            String sortedString = new String(str.chars().sorted().toArray(),0,str.length());
            map.computeIfAbsent(sortedString,k->new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
