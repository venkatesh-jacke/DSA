package gfg_2025.BackTracking;

import java.util.*;

//https://www.geeksforgeeks.org/problems/n-queen-problem0315/1

public class NQueen {

    static ArrayList<ArrayList<Integer>> result;

    public static void main(String[] args) {
        int n = 4;
        System.out.println(nQueen(n));
    }

    public static ArrayList<ArrayList<Integer>> nQueen(int n) {
        result = new ArrayList<>();
        int[][] board = new int[n][n];
        ArrayList<Integer> temp = new ArrayList<>();
        solve(board, n, 0, temp);
        return result;
    }

    public static void solve(int[][] board, int n, int row, ArrayList<Integer> temp) {
        if (row == n) {
            result.add(new ArrayList<>(temp));
            return;  //If all rows are filled with queens
        }

        //try to place queen in every column in a row
        for (int col = 0; col < n; col++) {
            if (isSafe2(board, n, row, col)) {
                board[row][col] = 1;
                temp.add(col + 1);
                solve(board, n, row + 1, temp);
                //backTrack
                board[row][col] = 0;
                temp.remove(temp.size() - 1);
            }
        }
    }

    public static boolean isSafe(int[][] board, int n, int r, int c) {

        //Check the column from top
        for (int row = 0; row < n; row++) {
            if (board[row][c] == 1) return false;
        }

        //Left diagonal
        for (int row = r, col = c; row >= 0 && col >= 0; row--, col--) {
            if (board[row][col] == 1) return false;
        }

        //Right diagonal
        for (int row = r, col = c; row >= 0 && col < n; row--, col++) {
            if (board[row][col] == 1) return false;
        }

        return true;
    }

    public static boolean isSafe2(int[][] board, int n, int r, int c) {

        for (int i = 0; i < r; i++) {
            if (board[i][c] == 1) return false; //check the column
            if (c - (r - i) >= 0 && board[i][c - (r - i)] == 1) return false; //Left diagonal
            if (c + (r - i) < n && board[i][c + (r - i)] == 1) return false; //Right diagonal
        }

        return true;
    }

}