package Dequeue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> dq= new ArrayDeque<>();
        dq.add(1);
        dq.add(2); //Put the element in last
        dq.add(3);
        System.out.println(dq);
        dq.push(4); //Put the element in last
        System.out.println("After pushing "+dq);
        System.out.println("Peek is "+dq.peek());
        System.out.println("poll "+dq.poll()); //It will remove the peek element which means first element
        System.out.println("After poll "+dq);
        dq.pollFirst();
        System.out.println("After pollFirst "+dq);
        dq.pollLast();
        System.out.println("After pollLast "+dq);
    }


}
/*
add() ---> Put the element in last
push() --->Put the element in last
peek() ---> It always gives the first element
poll() ---> It will remove the peek element which means first element
pollFirst() --->  It will remove the peek element which means first element
pollLast()  --->  It will remove the peek element which means last element
*/
