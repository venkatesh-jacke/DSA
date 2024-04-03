package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        //int arr[]={5,5,4,3,2,4,1,0,1};
        int[] arr = {5,4, 3, 2, 1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    //Time O(n*n)
    static void selectionSort(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    min_idx = j;

                }
            }
            System.out.println("swap "+i+" and "+ min_idx);
            swap(arr,min_idx,i);
        }

    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

/*
Note:-
In Selection Sort we select the index of smaller element and swap it with the first half of the subArray
All smaller elements will be grouping in first subarray and remaining elements will group in second subarray

Dry Run
 0  1  2  3  4
{5, 4, 3, 2, 1}

swap(0,4)
1,4,3,2,5
swap(1,3)
1,2,3,4,5
swap(2,2)
1,2,3,4,5
swap(3,3)
1,2,3,4,5
swap(4,4)
1,2,3,4,5

1,2,3,4,5


*/
