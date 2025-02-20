package gfg_2025;

//https://www.geeksforgeeks.org/problems/find-median-in-a-stream-1587115620/1

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class GetMedian {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(getMedian(arr));
    }

    static public ArrayList<Double> getMedian(int[] arr) {
        ArrayList<Double> res = new ArrayList<>();
        PriorityQueue<Integer> left = new PriorityQueue<>(Collections.reverseOrder()); //maxHeap
        PriorityQueue<Integer> right = new PriorityQueue<>(); //minHeap


        //Always maintaining left heap has larger size
        for (int num : arr) {
            if (left.isEmpty() || left.peek() >= num) {
                left.add(num);
            } else {
                right.add(num);
            }

            //balance the heaps
            if (left.size() > right.size() + 1) {
                right.add(left.poll());
            } else if (right.size() > left.size()) {
                left.add(right.poll());
            }
            //calculate median
            if (left.size() == right.size()) {
                res.add((left.peek() + right.peek()) / 2.0);
            } else {
                res.add(left.peek() * 1.0);
            }
        }
        return res;
    }
}
