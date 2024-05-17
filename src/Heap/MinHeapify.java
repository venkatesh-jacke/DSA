package Heap;

import java.util.Arrays;

public class MinHeapify {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        buildMinHeap(arr);
        System.out.println(Arrays.toString(arr));
    }

    public  static  void buildMinHeap(int[] arr){
        int startIdx= (arr.length / 2)-1;

        for(int i=startIdx;i>=0;i--){
            minHeapify(arr,i);
        }
    }
    public static void minHeapify(int[] arr,int i) {
        int size = arr.length;
        if(i>size) return;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largerIndex = i;

        if (left <= size - 1 && arr[left] < arr[largerIndex]) {
            largerIndex = left;
        }
        if (right <= size - 1 && arr[right] < arr[largerIndex]) {
            largerIndex = right;
        }
        if (largerIndex != i) {
            swap(arr,i,largerIndex);
            minHeapify(arr,largerIndex);
        }

    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
