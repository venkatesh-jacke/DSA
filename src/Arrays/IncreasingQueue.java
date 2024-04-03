package Arrays;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class IncreasingQueue {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 3, 1, 2, 4};

        increasingQueue(arr);

    }


    //With Dequeue
    static void increasingQueue(int[] arr) {
        int n = arr.length;
        int[] firstSmallerToLeft = new int[n];
        int[] firstSmallerToRight = new int[n];
        Arrays.fill(firstSmallerToLeft, -1);
        Arrays.fill(firstSmallerToRight, -1);
        Deque<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            while (!q.isEmpty() && arr[q.peek()] >= arr[i]) {
                firstSmallerToRight[q.remove()] = arr[i];
            }
            if (!q.isEmpty())
                firstSmallerToLeft[i] = arr[q.peek()]; //If the q is not emptier than it contains value smaller to its left indics
            q.push(i);
            System.out.println(q);
        }
        System.out.println("firstSmallerToLeft: " + Arrays.toString(firstSmallerToLeft));
        System.out.println("firstSmallerToRight: " + Arrays.toString(firstSmallerToRight));

    }


}
