package Arrays;

import java.util.*;

public class DecreasingQueue {


    public static void main(String[] args) {
        int[] arr = new int[]{5, 3, 1, 2, 4};
        System.out.println("Using Dequeue");
        decreasingQueue(arr);
    }

    //Using Dequeue
    static void decreasingQueue(int[] arr) {

        int n = arr.length;
        int[] firstGreaterToLeft = new int[n];
        int[] firstGreaterToRight = new int[n];
        Arrays.fill(firstGreaterToLeft, -1);
        Arrays.fill(firstGreaterToRight, -1);
        Deque<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int v = arr[i];
            while (!q.isEmpty() && arr[q.peek()] <= v) {
                firstGreaterToRight[q.remove()] = v;
            }
            if (!q.isEmpty())
                firstGreaterToLeft[i] = arr[q.peek()];
            q.push(i);
        }
        System.out.println("firstGreaterToLeft: " + Arrays.toString(firstGreaterToLeft));
        System.out.println("firstGreaterToRight: " + Arrays.toString(firstGreaterToRight));
    }


}
