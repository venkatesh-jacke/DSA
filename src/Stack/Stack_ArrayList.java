package Stack;

import java.util.ArrayList;

public class Stack_ArrayList {

    static class StackAL{
        ArrayList<Integer> list= new ArrayList<>();

        boolean isEmpty(){
            return list.isEmpty();
        }
        void push(int data){
            list.add(data);
        }

        int pop(){
            if(list.isEmpty()) return -1;
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        int peek(){
            int top = list.get(list.size()-1);
            return top;
        }
    }
    public static void main(String[] args) {
        StackAL stackAL= new StackAL();
        stackAL.push(1);
        stackAL.push(2);
        stackAL.push(3);
        stackAL.push(4);
        stackAL.push(5);

        while(!stackAL.isEmpty()){
            System.out.println(stackAL.peek());
            stackAL.pop();
        }

    }
}
