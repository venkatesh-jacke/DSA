package gfg;


//https://www.geeksforgeeks.org/problems/product-array-puzzle4525/1

import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] arr = {12, 0};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }

    static int[] productExceptSelf(int arr[]) {
        // code here
        int n = arr.length;
        int[] res = new int[n];
        int[] left = new int[n];
        left[0] = 1;
        //Calculate left product
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * arr[i - 1];

        }
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] = right * left[i];
            right = right * arr[i];
        }
        return res;
    }
}
