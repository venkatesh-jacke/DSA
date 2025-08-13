package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
       // int[] arr = {5,4,3,2,1};
        int arr[]={1,2,3,4,5};
        System.out.println("Before Sorting "+Arrays.toString(arr));
        int iterations = bubbleSort2(arr);
        System.out.println("After Sorting "+Arrays.toString(arr));
        System.out.println();
        System.out.println("No of iterations is " + iterations);


    }


    //Time O(n*n)
    public static int bubbleSort2(int[] arr) {
        int size = arr.length;
        boolean swapped;
        int itr = 0;
        for (int i = 0; i < size - 1; i++) {
            swapped = false;
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    System.out.println("swap " + arr[j] + " and " + arr[j + 1]);
                    swap(arr, j, j + 1);
                    System.out.println(Arrays.toString(arr));
                    swapped = true;
                }
              itr++;

            }
            if (!swapped) {
                System.out.println("No swap");
                break;
            }
        }
        return itr;
    }
    public static int bubbleSort(int[] arr) {
        int size = arr.length;
        int itr = 0;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    System.out.println("swap " + arr[j] + " and " + arr[j + 1]);
                    swap(arr, j, j + 1);
                    System.out.println(Arrays.toString(arr));
                }
                itr++;

            }
        }
        return itr;
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}


/*
Note:-
In BubbleSort the larger element will move to the end in each iteration

Dry run
{5,4,3,2,1}

4,5,3,2,1
4,3,5,2,1
4,3,2,5,1
4,3,2,1,5

3,4,2,1,5
3,2,4,1,5
3,2,1,4,5

2,3,1,4,5
2,1,3,4,5

1,2,3,4,5

*/
