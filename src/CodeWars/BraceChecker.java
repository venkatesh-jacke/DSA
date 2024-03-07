package CodeWars;

import java.util.Stack;

public class BraceChecker {
    public static void main(String[] args) {
        String str = ")(}{][";
        System.out.println(isValid2(str));
    }

    static public boolean isValid(String braces) {
        Stack<Character> stack = new Stack<>();
        for (char i : braces.toCharArray()) {
            if (i == ')' && !stack.isEmpty() && stack.peek() == '(') stack.pop();
            else if (i == '}' && !stack.isEmpty() && stack.peek() == '{') stack.pop();
            else if (i == ']' && !stack.isEmpty() && stack.peek() == '[') stack.pop();
            else stack.push(i);
        }
        return stack.isEmpty() ? true : false;
    }

    static public boolean isValid2(String braces) {
        for (int i = 0; i < braces.length(); i++) {
            braces = braces.replace("{}", "").replace("[]", "").replace("()", "");
        }
        return braces.isEmpty();
    }


}
