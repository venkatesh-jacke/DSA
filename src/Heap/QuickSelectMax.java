package Heap;

public class QuickSelectMax {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(kthLargest(arr, 0, arr.length - 1, 1));
    }

    public static int kthLargest(int[] arr, int low, int high, int k) {
        if (low <= high) {
            int pi = partition(arr, low, high);

            //k-1 because it's a zero based indexing
            if (pi == k - 1) {
                return arr[pi];
            } else if (pi < k - 1) {
                return kthLargest(arr, pi + 1, high, k);
            } else {
                return kthLargest(arr, low, pi - 1, k);
            }
        }
        return Integer.MIN_VALUE;
    }

    public static int partition(int[] arr, int low, int high) {
        int pi = high;
        int pivot = arr[pi];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] > pivot) {
                swap(arr, ++i, j);
            }
        }
        swap(arr, ++i, pi);
        return i;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
