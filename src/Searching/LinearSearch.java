package Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[]= {9,8,7,6,5,4,3,2,1};
        int target=5;
        linearSearch(arr,target);

    }
    static void linearSearch(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
           if(arr[i]==target) {
               System.out.println("Target found at " + i);
               return;
           }
        }
        System.out.println("Target Not Found");;
    }
}
