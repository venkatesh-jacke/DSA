package Sorting;

import java.util.Arrays;

public class MergeSort_2 {
    public static void main(String[] args) {
        //int[] arr = {5, 4, 4, 5, 3, 2, 1, 0, 3, 2, 1, 0};

        int[] arr={5,4,3,2,1};
        System.out.println("Original Array: " + Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    static void mergeSort(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2; // to avoid overflow
        System.out.println("Dividing: start=" + start + ", mid=" + mid + ", end=" + end);

        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);

    }

    static void merge(int arr[], int start, int mid, int end) {
        System.out.println("Merging: start=" + start + ", mid=" + mid + ", end=" + end);

        int merged[] = new int[end - start + 1]; // to maintain correct length

        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                merged[k++] = arr[i++];
            } else {
                merged[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            merged[k++] = arr[i++];
        }

        while (j <= end) {
            merged[k++] = arr[j++];
        }

        // Copy merged array back to the original array
        for (int l = 0, p = start; l < merged.length; l++, p++) {
            arr[p] = merged[l];
        }

        System.out.println("Merged Array: " + Arrays.toString(Arrays.copyOfRange(arr, start, end + 1)));
    }
}
