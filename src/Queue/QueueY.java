package Queue;

public class QueueY {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(5);
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);
        myQueue.add(5);
        System.out.println(myQueue);

        while(!myQueue.isEmpty()){
            System.out.println(myQueue.peek());
            myQueue.remove();
        }
        System.out.println(myQueue.isEmpty());

    }

   static class MyQueue {
        int size;
        int arr[];
        int rear = -1;

        MyQueue(int size) {
            this.size = size;
            arr = new int[size];
        }

        boolean isEmpty() {
            return rear == -1;
        }

        void add(int data) {
            if (rear == arr.length - 1) {
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++)
                arr[i] = arr[i + 1];
            rear--;
            return front;
        }

        int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }

       @Override
       public String toString() {
            StringBuilder sb = new StringBuilder();
           for(int i=0;i<size;i++){
               sb.append(arr[i]+" ");

           }
           return sb.toString();
       }
   }


/*    Initially
      front=-1 rear=-1
      adding first element both the front & rear will point to 0
      adding more elements rear will increment
      removing the elements the rear will decrement

 */
}
