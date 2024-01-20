package Queue;

public class QueueLinkedList {
    public static void main(String[] args) {
        QueueY.MyQueue myQueue = new QueueY.MyQueue(5);
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);
        myQueue.add(5);


        while(!myQueue.isEmpty()){
            System.out.println(myQueue.peek());
            myQueue.remove();
        }
    }

    class MyQueueLL {
        Node head = null;
        Node tail = null;

        boolean isEmpty() {
            return head == null && tail == null;
        }

        void add(int data) {
            Node newNode = new Node(data);
            if (tail == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front= head.data;
            head=head.next;
            return front;
        }

        int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
    }

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
