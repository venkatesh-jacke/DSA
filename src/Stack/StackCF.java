package Stack;

import java.util.*;

public class StackCF {

    public static void main(String[] args) {
        // Creating a stack
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Original Stack: " + stack);

        pushAtBottom(stack, 4);
        System.out.println("Stack after Pushing 4 at the Bottom: " + stack);

        stackReverse(stack);
        System.out.println("After reversing a stack "+stack);
    }

    // Function to push an element at the bottom of the stack using recursion
    static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        // Recursive case: pop the top element, push data at the bottom, push back the top element
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    static void stackReverse(Stack<Integer> s){
        if(s.isEmpty()) return;
        int top = s.pop();
        stackReverse(s);
        pushAtBottom(s, top);
    }

}
