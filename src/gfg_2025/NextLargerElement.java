package gfg_2025;

import java.util.*;

//https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1

public class NextLargerElement {
    public static void main(String[] args) {
        int[] arr = {6, 8, 0, 1, 3};
        System.out.println(nextLargerElement(arr));
    }

    static public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(arr.length, -1));
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                ans.set(stack.pop(), arr[i]);
            }
            stack.push(i);
        }

        return ans;
    }
}
