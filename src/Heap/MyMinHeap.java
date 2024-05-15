package Heap;

import java.util.ArrayList;
import java.util.List;

public class MyMinHeap<T extends Comparable<T>> {
    private List<T> list;

    public MyMinHeap() {
        list = new ArrayList<>();
    }

    void swap(int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    public int left(int index) {
        return 2 * index + 1;
    }

    public int right(int index) {
        return 2 * index + 2;
    }

    public void insert(T value) {
        list.add(value);
        upHeap(list.size() - 1);

    }

    public void upHeap(int index) {
        if (index == 0) return;
        int p = parent(index);
        if (list.get(index).compareTo(list.get(p)) < 0) {
            swap(index, p);
            upHeap(p);
        }
    }


    public void downHeap(int index) {
        int min = index;
        int left = left(index);
        int right = right(index);

        if (left < list.size() && list.get(min).compareTo(list.get(left)) > 0) {
            min = left;
        }
        if (right < list.size() && list.get(min).compareTo(list.get(right)) > 0) {
            min = right;
        }

        if (min != index) {
            swap(min, index);
            downHeap(min);
        }

    }

    public T  remove() throws Exception {
        if (list.isEmpty()) throw new Exception("Removing from an empty Heap");
        T first = list.get(0);
        T last = list.remove(list.size() - 1);
        if (!list.isEmpty()) {
            list.set(0, last);
            downHeap(0);
        }
        return first;
    }

    public ArrayList<T> heapSort() throws Exception {
        ArrayList<T> data = new ArrayList<>();
        while (!list.isEmpty()) {
            data.add(this.remove());
        }
        return data;
    }
}

//https://www.youtube.com/watch?v=Qf-TDPr0nYw&ab_channel=KunalKushwaha