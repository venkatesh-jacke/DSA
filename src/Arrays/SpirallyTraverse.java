package Arrays;

import java.util.ArrayList;
import java.util.List;

public class SpirallyTraverse {
    public static void main(String[] args) {

    }

    static public ArrayList<Integer> spirallyTraverse(int[][] mat) {
        // code here
        int top = 0, bottom = mat.length - 1, left = 0, right = mat[0].length - 1;
        ArrayList<Integer> result = new ArrayList<>();

        if (mat == null || mat.length == 0)
            return result;

        while (top < bottom && left < right) {
            // Traverse Top Row
            for (int i = left; i <= right; i++) {
                result.add(mat[top][i]);
            }
            top++;
            // Traverse Right Column
            for (int i = top; i <= bottom; i++) {
                result.add(mat[i][right]);
            }
            right--;
            //Traverse bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(mat[bottom][i]);
                }
                bottom--;
            }
            //Traverse left Column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(mat[i][left]);
                }
                left++;
            }
        }
        return result;

    }
}
