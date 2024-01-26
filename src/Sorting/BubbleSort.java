package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
       // int[] arr = {5,4,3,2,1};
        int arr[]={1,2,3,4,5};
        printArray(arr);
        System.out.println();
        int iterations = bubbleSort(arr);

        printArray(arr);
        System.out.println();
        System.out.println("No of iterations is " + iterations);


    }

    public static int bubbleSort(int[] arr) {
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
                if (!swapped) {
                    System.out.println("No swap");
                    break;
                }
            }
        }
        return itr;
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    // Utility method to print the elements of an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}