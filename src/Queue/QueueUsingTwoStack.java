package Queue;

import java.util.Stack;

public class QueueUsingTwoStack {
    public static void main(String[] args) {
        MyQueue queue= new MyQueue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        while(!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.remove();
        }


    }

   static  class MyQueue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        boolean isEmpty() {
            return s1.isEmpty();
        }

        void add(int data) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(data);
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return s1.pop();
        }

        int peek(){
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return s1.peek();
        }
    }
}
