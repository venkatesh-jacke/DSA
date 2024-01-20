package Queue;

public class CircularQueue {
    public static void main(String[] args) {
        QueueY.MyQueue myQueue = new QueueY.MyQueue(5);
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);
        myQueue.add(5);
        System.out.println(myQueue.remove());
        myQueue.add(6);
        System.out.println(myQueue.remove());
        myQueue.add(7);
        while(!myQueue.isEmpty()){
            System.out.println(myQueue.peek());
            myQueue.remove();
        }

    }

    class MyCircularQueue {
        int size;
        int arr[];

        int front = -1;
        int rear = -1;


        MyCircularQueue(int size) {
            this.size = size;
            arr = new int[size];
        }

        boolean isFull() {
            return (rear + 1) % size == front;
        }

        boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }

            //First element
            if (front == -1) front++;
            rear = (rear + 1) % size;
            arr[rear] = data;

        }

        int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int element = arr[front];

            //single element condition
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return element;
        }

        int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
            }
            return arr[front];
        }
    }
}
