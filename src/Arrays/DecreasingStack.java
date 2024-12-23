package Arrays;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class DecreasingStack {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 3, 1, 2, 4};
        System.out.println("Using Stack");
        decreasingStack(arr);
    }


    //Using Stack
    static void decreasingStack(int[] arr) {
        int n = arr.length;
        int[] firstSmallerToLeft = new int[n];
        int[] firstSmallerToRight = new int[n];
        Arrays.fill(firstSmallerToLeft, -1);
        Arrays.fill(firstSmallerToRight, -1);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            int cur = arr[i];
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                firstSmallerToRight[stack.pop()] = cur;
            }
            if (!stack.isEmpty())
                firstSmallerToLeft[i] = arr[stack.peek()];

            stack.push(i);
        }
        System.out.println("firstGreaterToLeft: " + Arrays.toString(firstSmallerToLeft));
        System.out.println("firstGreaterToRight: " + Arrays.toString(firstSmallerToRight));
    }
}
