package Sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);
    }

    // Main QuickSort method
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Get the index of the pivot element after partitioning
            int pi = partition_high(arr, low, high);   //Partition Index
            // Recursively sort the subarrays before and after the pivot
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Partitioning method to place the pivot in its correct position  Pivot is first elemnt
    public static int partition_low(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }

            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
            }

        }
        swap(arr, low, j);

        return j;
    }



    //Pivot is last element
    public static int partition_high(int[] arr, int low, int high) {
        // Choose the rightmost element as the pivot
        int pivot = arr[high];
        // Initialize the index of the smaller element
        int i = low - 1;
        int j;
        // Iterate through the array
        for (j = low; j < high; j++) {
            // If the current element is less than the pivot
            if (arr[j] < pivot) {
                // Increment the index of the smaller element
                i++;
                // Swap arr[i] and arr[j]
                swap(arr, i, j);
            }
        }

        // Swap arr[i + 1] and arr[high] to place the pivot in its correct position
        swap(arr, i + 1, high);
        // Return the index of the pivot element
        return i + 1;
    }




    // Utility method to swap elements in an array
    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    // Utility method to print the elements of an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
