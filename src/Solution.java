

import javafx.util.Pair;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
       int  n = 15;
       int[][] queries = {{0,1},{2,2},{0,3}};
        System.out.println(Arrays.toString(productQueries(n,queries)));
    }

     static public int[] productQueries(int n, int[][] queries) {
         int[] power = new int[queries.length];
         Arrays.fill(power,1);
         for(int i=0;i<power.length;i++){
             for(int j=queries[i][0];j<=queries[i][1];j++){
                 power[i] *= Math.pow(2,j);
             }
         }
         return power;
     }
}