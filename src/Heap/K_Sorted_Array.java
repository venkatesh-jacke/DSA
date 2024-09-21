package Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class K_Sorted_Array {
    public static void main(String[] args) {
        int[] arr = {6, 5, 3, 2, 8, 10, 9};
        int k = 3;
        kSorted(arr, 3);
        System.out.println(Arrays.toString(arr));

    }

    public static void kSorted(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < k + 1; i++) {
            pq.add(arr[i]);
        }
        int j = 0;
        for (int i = k + 1; i < arr.length; i++) {
            arr[j++] = pq.poll();
            pq.add(arr[i]);
        }
        while (!pq.isEmpty())
            arr[j++] = pq.poll();
    }

}
