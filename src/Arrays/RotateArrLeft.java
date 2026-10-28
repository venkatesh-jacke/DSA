package Arrays;

import java.util.Arrays;

//https://www.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1
public class RotateArrLeft {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int d = 3;
        rotateArr(arr, d);
        System.out.println(Arrays.toString(arr));
    }

    static void rotateArr(int arr[], int d) {
        // add your code here
        int n = arr.length;
        d %= n;
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
