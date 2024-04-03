package Sorting;


import java.util.Arrays;

class InPlaceMergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 5, 5, 4, 3, 2, 5, 1, 0};
        inPlaceMergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void inPlaceMergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            inPlaceMergeSort(arr, start, mid);
            inPlaceMergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int i = start;
        int j = mid + 1;

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                i++;
            } else {
                int temp = arr[j];
                // Shift elements to make space for the element from the right side
                for (int k = j; k > i; k--) {
                    arr[k] = arr[k - 1];
                }
                arr[i] = temp;

                i++;
                j++;
                mid++;
            }
        }
    }
}
