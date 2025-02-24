package gfg_2025;

//https://www.geeksforgeeks.org/problems/stock-span-problem-1587115621/1

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class CalculateSpan {
    public static void main(String[] args) {
        int[] arr = {100, 80, 60, 70, 60, 75, 85};
        System.out.println(calculateSpan(arr));
    }

    static public ArrayList<Integer> calculateSpan(int[] arr) {
        // write code here
        ArrayList<Integer> res = new ArrayList<>(Collections.nCopies(arr.length, 1));
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            int span = 1;
            // Remove elements from the stack while the current price
            // is greater than or equal to stack's top price
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                span += res.get(stack.pop());  // Add span of popped index
            }
            res.set(i, span);
            stack.push(i);
        }
        return res;
    }
}
