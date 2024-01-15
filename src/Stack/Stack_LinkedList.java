package Stack;

public class Stack_LinkedList {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        static Node head = null;

        boolean isEmpty() {
            return head == null;
        }

        void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        int pop() {
            if (isEmpty()) return -1;
            int top = head.data;
            head = head.next;
            return top;
        }

        int peek() {
            if (isEmpty()) return -1;
            int top = head.data;
            return top;
        }

    }

    public static void main(String[] args) {
        Stack stackLL= new Stack();
        stackLL.push(1);
        stackLL.push(2);
        stackLL.push(3);
        stackLL.push(4);
        stackLL.push(5);

        while(!stackLL.isEmpty()){
            System.out.println(stackLL.peek());
            stackLL.pop();
        }

    }
}


