package gfg_2025;

//https://www.geeksforgeeks.org/problems/parenthesis-checker2744/1

import java.util.HashMap;
import java.util.Stack;

//https://www.geeksforgeeks.org/problems/parenthesis-checker2744/1

public class IsBalanced {
    public static void main(String[] args) {
        String s = "[()()]{}";
        System.out.println(isBalanced2(s));
    }

    static boolean isBalanced(String s) {
        // code here
        HashMap<Character, Character> map = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        map.put('{', '}');
        map.put('[', ']');
        map.put('(', ')');
        for (char ch : s.toCharArray()) {
            if (map.containsKey(ch)) {
                stack.push(ch); //push all opening brackets
            } else {
                //If close bracket mismatches with stack top ts false
                if (stack.isEmpty() || map.get(stack.pop()) != ch) {
                    return false;
                }
            }
        }
        return stack.isEmpty();// Stack should be empty for a valid string
    }

    static boolean isMatch(char c1, char c2) {
        if (c1 == '(' && c2 == ')') return true;
        if (c1 == '{' && c2 == '}') return true;
        if (c1 == '[' && c2 == ']') return true;
        return false;
    }

    static boolean isBalanced2(String s) {
        int top = -1;
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (top < 0 || !isMatch(chars[top], s.charAt(i))) {
                top++; //push
                chars[top] = s.charAt(i);
            } else {
                top--; //pop
            }
        }
        return top == -1;
    }
}
