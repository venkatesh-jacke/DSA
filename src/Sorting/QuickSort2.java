package Sorting;

import java.util.Arrays;


//Apna college  https://www.youtube.com/watch?v=QXum8HQd_l4

public class QuickSort2 {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            System.out.println("Partitioning Done: " + Arrays.toString(arr));
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        System.out.println("Pivot: " + pivot + ", Arr: " + Arrays.toString(arr));
        int i = low - 1;
        for (int j = low; j < high; j++) {
            System.out.println("Comparing " + arr[j] + " with " + pivot);
            if (arr[j] <= pivot) {
                i++;
                if (i != j) {
                    System.out.println("Swap: " + arr[i] + " and " + arr[j] + ", Arr: " + Arrays.toString(arr));
                    swap(arr, i, j);
                }
            }
        }
        System.out.println("Final Swap: " + arr[i + 1] + " and " + arr[high] + ", Arr: " + Arrays.toString(arr));
        ++i; //put pivot in correct position
        swap(arr, i, high);
        return i;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}