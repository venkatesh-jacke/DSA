package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

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
/*
Partition High
ind = {0,1,2,3,4}
arr = {5,4,3,2,1}

pivot = 1  low=0 j=low  i=low-1
we didnt find any values greater than 1 so the j stops at 2 i is standing in -1

Now we have to place the pivot in its correct position
swap(i+1, high) because high is always pivot here
arr ={1,4,3,2,5}


pivot = 5 low=1 j stands in 4 i stands in 5





*/
