package Zoho;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(printNthRow(n));  //1 based index
        System.out.println(getRow(n));      //0 based index
        System.out.println(getNthItem(4, 0));
        System.out.println(generatePascalsTriangle(5));
    }


    //1 based Indexing
    static List<Integer> printNthRow(int row) {
        List<Integer> res = new ArrayList<>();
        int ans = 1;
        for (int i = 1; i <= row; i++) {
            res.add(ans);
            ans = ans * (row - i);
            ans = ans / (i);
            // ans= res.get(i - 1) * (row - i + 1) / i;
        }
        return res;
    }

    //0 based Indexing
    static public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        int ans = 1;
        for (int i = 0; i <= rowIndex; i++) {
            res.add(ans);
            ans = ans * (rowIndex - i);
            ans = ans / (i + 1);

        }
        return res;
    }

    static int getNthItem(int n, int r) {
        int res = 1;
        for (int i = 1; i <= r; i++) {
            res *= (n - i + 1);
            res /= i;
        }
        return res;
    }

    static List<List<Integer>> generatePascalsTriangle(int n) {
        List<List<Integer>> triangle = new ArrayList<>();
        if (n < 0) return triangle;

        for (int i = 0; i <= n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1); // First and last element in each row is 1
                } else {
                    int val = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                    row.add(val);
                }
            }
            triangle.add(row);
        }
        return triangle;
    }

}
