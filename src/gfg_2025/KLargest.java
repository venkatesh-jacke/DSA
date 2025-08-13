package gfg_2025;

//https://www.geeksforgeeks.org/problems/k-largest-elements4206/1

import java.util.*;

public class KLargest {
    public static void main(String[] args) {

    }

    //maxHeap
    static public ArrayList<Integer> kLargest_maxHeap(int[] arr, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        for (int i : arr) {
            maxHeap.offer(i);
        }
        while (k-- > 0) {
            res.add(maxHeap.poll());
        }
        return res;
    }

    //minHeap
    static public ArrayList<Integer> kLargest_minHeap(int[] arr, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        for (int i : arr) {
            maxHeap.offer(i);
        }
        while (k-- > 0) {
            res.add(maxHeap.poll());
        }
        return res;
    }
}
