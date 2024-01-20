package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int target = 0;
        System.out.println("Binary Search");
        binarySearch(arr,target);
    }

    static void binarySearch(int arr[], int target) {
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int mid=low+(high-low)/2;

            if(arr[mid]==target) {
                System.out.println("Target found at "+mid);
                return;
            }
            else if(target>arr[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        System.out.println("Target Not Found");

    }
}
