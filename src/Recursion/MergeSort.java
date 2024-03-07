package Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr=new int[]{4,1,3,2,-1,0,7,10,19,20,5,5};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    static void mergeSort(int[] arr,int start,int end){

        if(start<end){
            int mid=(start+end) / 2;
            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }

    }
    static void merge(int[] arr,int start,int mid,int end){
        int[] temp = new int[end-start+1];
        int i=start,j=mid+1,k=0;

        //While both arrays have values merge them

        while(i<=mid && j<=end){

            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }else {
                temp[k++]=arr[j++];
            }
        }
        while(i<=mid)  temp[k++]=arr[i++];
        while(j<=end)  temp[k++]=arr[j++];

        for(i=start;i<=end;i++) arr[i]=temp[i-start];
    }
}
