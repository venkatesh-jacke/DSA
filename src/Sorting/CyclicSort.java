package Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static public void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            // Calculate the correct index for arr[i]
            if (arr[i] != arr[correctIndex]) {
                // Swap arr[i] with the element at its correct index
                int temp = arr[correctIndex];
                arr[correctIndex] = arr[i];
                arr[i] = temp;
            }
            else{
                // Move to the next element only when arr[i] is at its correct position
                i++;
            }
        }
    }
}
