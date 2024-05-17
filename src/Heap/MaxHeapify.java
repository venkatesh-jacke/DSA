package Heap;

import java.util.Arrays;

public class MaxHeapify {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        buildMaxHeap(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void buildMaxHeap(int[] arr) {
        int startIdx = (arr.length / 2) - 1; // Index of last non-leaf node
        for (int i = startIdx; i >= 0; i--) {
            maxHeapify(arr, i);
        }
    }

    static public void maxHeapify(int arr[], int i) {
        int size = arr.length;
        if(i>size) return;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largerIndex = i;

        if (left <= size - 1 && arr[left] > arr[largerIndex]) {
            largerIndex = left;
        }
        if (right <= size - 1 && arr[right] > arr[largerIndex]) {
            largerIndex = right;
        }
        if (largerIndex != i) {
            swap(arr,i,largerIndex);
            maxHeapify(arr,largerIndex);
        }

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}