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
        // Stores indices in decreasing order of values
        for (int i = 0; i < n; i++) {
            int current = arr[i];
            //Remove all smaller or equal elements.
            //Since current element is greater,it becomes the First Greater Element to the Right
            while (!q.isEmpty() && arr[q.peek()] <= current) {
                int index = q.remove();
                firstGreaterToRight[index] = current;
            }
            /*
             * After removing all smaller elements,
             * the top of the stack (if present)
             * is the nearest greater element on the left.
             */
            if (!q.isEmpty())
                firstGreaterToLeft[i] = arr[q.peek()];
            q.push(i);
        }
        System.out.println("firstGreaterToLeft: " + Arrays.toString(firstGreaterToLeft));
        System.out.println("firstGreaterToRight: " + Arrays.toString(firstGreaterToRight));
    }
}

/*
Elements remaining in the stack are the candidates for the first greater element on the left.
Elements popped from the stack have just found their first greater element on the right (the current element).
*/
