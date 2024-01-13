package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,0};
        int[] sortedArray = mergeSort(arr);
        printArray(sortedArray);


    }


    private static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] leftArray = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] rightArray = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(leftArray, rightArray);

    }

    private static int[] merge(int[] leftArray, int[] rightArray) {
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;
        int[] finalArray = new int[leftSize + rightSize];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftArray[i] < rightArray[j]) {
                finalArray[k] = leftArray[i];
                i++;
            } else {
                finalArray[k] =rightArray[j];
                j++;
            }
            k++;
        }
        while (i < leftSize) {

            finalArray[k++] = leftArray[i];
            i++;

        }
        while (j < rightSize) {
            finalArray[k++] = rightArray[j];
            j++;
        }
        return finalArray;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
