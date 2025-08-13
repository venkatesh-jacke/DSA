package gfg_2025.BackTracking;

import java.util.Arrays;


//https://www.naukri.com/code360/problems/sudoku-solver_699919?leftPanelTabValue=PROBLEM

public class SudokuSolver2 {
    public static void main(String[] args) {
        int[][] board = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        sudokuSolver(board);
        System.out.println(Arrays.deepToString(board));
    }

    static void sudokuSolver(int[][] board) {
        solve(board,0,0);
    }


    static boolean solve(int[][] board, int row, int col) {
        if (row == 8 && col == 9) return true; // completed all col in all row
        if (col == 9) { //if all col in a row  is over jump to next row start the col with 0
            row ++;
            col = 0;
        }
        if (board[row][col] != 0) { //if not empty jump to next cell
            return solve(board, row, col + 1);
        }

        //Try to place val 1-9 in empty cells
        for (int i = 1; i <= 9; i++) {
            if (isValid(board, row, col, i)) {
                board[row][col] = i;
                if (solve(board, row, col + 1)) {
                    return true;
                }
                board[row][col] = 0; //backTrack
            }
        }
        return false;
    }

    static boolean isValid(int[][] board, int row, int col, int val) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == val) return false;
            if (board[i][col] == val) return false;
            if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == val) return false;

        }
        return true;
    }

}
