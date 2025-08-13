package Arrays;

import java.util.Arrays;

//Rotate matrix to 90 degree
//here the matrix is square
public class RotateMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(mat);
        System.out.println(Arrays.deepToString(mat));
    }

    public static void rotate(int[][] mat) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            reverse(mat[i]);
        }

    }

    public static void reverse(int[] row) {
        int start = 0, end = row.length - 1;
        while (start < end) {
            int temp = row[start];
            row[start] = row[end];
            row[end] = temp;
            start++;
            end--;
        }
    }
}

