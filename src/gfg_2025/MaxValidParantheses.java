package gfg_2025;

import java.util.Stack;

public class MaxValidParantheses {
    public static void main(String[] args) {
        String s = "((()";
        System.out.println(maxLength2(s));
    }

    static int maxLength(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); // Push -1 to handle the case when the first valid substring starts from index 0
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(i);
            } else {
                // If it's a closing bracket, pop the last opening bracket index
                stack.pop();
                if (!stack.isEmpty()) {
                    maxLen = Math.max(maxLen, i - stack.peek());
                } else {
                    // If stack is empty, push the current index as a new base for future calculations
                    stack.push(i);
                }
            }
        }
        return maxLen;
    }

    static int maxLength2(String s) {
        int maxLen = 0;
        int open = 0, close = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                open++;
            } else {
                close++;
            }
            if (open == close) {
                maxLen = Math.max(maxLen, open + close);
            } else if (close > open) {
                open = close = 0;
            }
        }
        open = close = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') {
                open++;
            } else {
                close++;
            }
            if (open == close) {
                maxLen = Math.max(maxLen, open + close);
            } else if (close < open) {
                open = close = 0;
            }
        }
        return maxLen;
    }
}
