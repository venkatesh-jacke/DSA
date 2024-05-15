package Heap;

public class Main {
    public static void main(String[] args) throws Exception {
        MyMinHeap<Integer> myHeap= new MyMinHeap<>();
        myHeap.insert(12);
        myHeap.insert(11);
        myHeap.insert(10);
        myHeap.insert(9);
        myHeap.insert(0);
        System.out.println(myHeap.heapSort());
    }
}
