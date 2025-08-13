package gfg_2025.BackTracking;

import java.util.Arrays;


//https://www.naukri.com/code360/problems/sudoku-solver_699919?leftPanelTabValue=PROBLEM

public class SudokuSolver {
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
        solve(board);
    }


    static boolean solve(int[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == 0) {
                    for (int val = 1; val <= 9; val++) {
                        if (isValid(board, i, j, val)) {
                            board[i][j] = val;
                            if (solve(board))
                                return true;
                            else
                                board[i][j] = 0; //backTrack
                        }
                    }
                    return false; //when we cant place any valid number into the empty cell
                }
            }
        }
        return true;
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
