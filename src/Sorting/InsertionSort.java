package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        insertionSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    static void insertionSort(int arr[]) {
        System.out.println("Original Array: " + Arrays.toString(arr));

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            System.out.println("\nCurrent key is " + current);

            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                System.out.println("Moving " + arr[j] + " to the right");
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = current;

            System.out.println("Array after iteration " + i + ": " + Arrays.toString(arr));
        }
    }
}
