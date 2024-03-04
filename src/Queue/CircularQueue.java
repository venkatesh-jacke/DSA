package Queue;

public class CircularQueue {
    public static void main(String[] args) {
     MyCircularQueue myCircularQueue= new MyCircularQueue(5);
     myCircularQueue.add(1);
     myCircularQueue.add(2);
     myCircularQueue.add(3);
     myCircularQueue.add(4);
     myCircularQueue.add(5);
     myCircularQueue.add(6);
     myCircularQueue.add(7);

     while(!myCircularQueue.isEmpty()){
         System.out.println(myCircularQueue.peek());
         myCircularQueue.remove();
     }


    }

   static class MyCircularQueue {
        int size;
        int arr[];

        int front = -1;
        int rear = -1;


        MyCircularQueue(int size) {
            this.size = size;
            arr = new int[size];
        }


        //I' am checking if front is the next element to the rear
        boolean isFull() {
            return (rear + 1) % size == front;
        }


        //Base condition in circular queue front && rear be -1
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
                //front++;
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
/*
Note:-
we used % operator to increment the index/
'%' operator plays a crucial role in achieving the circular behavior of the queue
by handling index wrapping and ensuring that indices stay within the bounds of the underlying array.

*/
