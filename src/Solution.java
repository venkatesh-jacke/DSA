

import javafx.util.Pair;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
       // int[][] grid = {{1, 1, 6, 1, 4, 6, 3, 1, 0, 7}};
//        int[][] grid = {
//                {1, 1, 1},
//                {0, 0, 0}
//        };
        int[][] grid = {
                {1, 0, 2},
                {1, 0, 2}
        };
        System.out.println(satisfiesConditions(grid));
    }


    public static boolean satisfiesConditions(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col; j++) {
                if (j+1<col && grid[i][j] == grid[i][j + 1])
                    return false;
                if (i+1<row &&grid[i][j] != grid[i + 1][j])
                    return false;
            }
        }
        return true;
    }


}
