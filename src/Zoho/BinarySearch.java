package Zoho;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10,9, 8, 7, 6, 5, 4, 3, 2, 1};
        int n=1;
        System.out.println(binarySearch(arr,n));
    }

    static int binarySearch(int[] arr,int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > target) {
                low = mid + 1;
            } else if (arr[mid] < target) {

                high = mid - 1;
            } else {
                return mid; // Element found
            }
        }

        return -1; // Element not found
    }
}
