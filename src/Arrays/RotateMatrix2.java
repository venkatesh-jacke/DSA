package Arrays;

import java.util.Arrays;

//Rotate matrix to 90 degree
//here the matrix is Non square
public class RotateMatrix2 {
    public static void main(String[] args) {
        int[][] mat = {{1, 2}, {3, 4}, {5, 6}};
        System.out.println(Arrays.deepToString(rotate(mat)));
    }

    public static int[][] rotate(int[][] mat) {
        int m = mat.length; // row
        int n = mat[0].length; //col
        int[][] ans = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[j][m - 1 - i] = mat[i][j];
            }
        }
        return ans;
    }

}

