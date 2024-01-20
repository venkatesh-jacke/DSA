package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueCF {
    public static void main(String[] args) {
        Queue<Integer>  myQueue = new ArrayDeque<>();
        //Queue<Integer>  myQueue = new LinkedList<>();
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
}
