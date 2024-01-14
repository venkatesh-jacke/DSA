package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        //int arr[]={5,5,4,3,2,4,1,0,1};
        int[] arr={5,4,3,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int arr[]){

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    System.out.println("swap "+arr[i]+" and "+arr[j]);
                    swap(arr,i,j);
                    System.out.println(Arrays.toString(arr));
                }
            }
        }

    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
