package gfg_2025;

import java.util.ArrayList;
import java.util.List;

public class NQueen2 {
    static ArrayList<ArrayList<Integer>> result;

    public static void main(String[] args) {
        int n = 4;
        System.out.println(nQueen(n));
    }

    public static ArrayList<ArrayList<Integer>> nQueen(int n) {
        result = new ArrayList<>();
        int[][] board = new int[n][n];
        boolean column[] = new boolean[n];
        boolean leftDiagonal[] = new boolean[2 * n];
        boolean rightDiagonal[] = new boolean[2 * n];
        ArrayList<Integer> temp = new ArrayList<>();
        solve(n, 0, temp, column, leftDiagonal, rightDiagonal);
        return result;
    }

    public static void solve(int n, int row, List<Integer> temp, boolean[] column, boolean[] leftDiagonal, boolean[] rightDiagonal) {
        if (row == n) {
            result.add(new ArrayList<>(temp));
        }
        for (int col = 0; col < n; col++) {
            if (column[col] || leftDiagonal[row - col + n - 1] || rightDiagonal[row + col]) continue;
            temp.add(col + 1);
            column[col] = leftDiagonal[row - col + n - 1] = rightDiagonal[row + col] = true;
            solve(n, row + 1, temp, column, leftDiagonal, rightDiagonal);
            temp.remove(temp.size() - 1);
            column[col] = leftDiagonal[row - col + n - 1] = rightDiagonal[row + col] = false;

        }
    }

}
