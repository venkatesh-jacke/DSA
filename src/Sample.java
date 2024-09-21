import java.util.*;

public class Sample {
    public static void main(String[] args) {
        System.out.println(reverseParentheses("(ed(et(oc))el)"));
    }

    static public String reverseParentheses(String s) {
        int n = s.length();
        int[] pair = new int[n];
        StringBuilder sb = new StringBuilder();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(')
                st.push(i);
            if (s.charAt(i) == '(') {
                int j = st.pop();
                pair[i] = j;
                pair[j] = i;
            }
        }
        for (int i = 0, dir = 1; i < n; i += dir) {
            if (s.charAt(i) == '(' || s.charAt(i) == ')') {
                i = pair[i];
                dir = -dir;
            } else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }

}