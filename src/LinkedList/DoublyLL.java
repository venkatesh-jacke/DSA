package LinkedList;

public class DoublyLL {
    public static void main(String[] args) {

        DoubleLL doubleLL = new DoubleLL();
        doubleLL.addFirst(1);
        doubleLL.addFirst(2);
        doubleLL.addFirst(3);
        doubleLL.addFirst(4);
//
//        doubleLL.addLast(5);
//        doubleLL.addLast(6);
//        doubleLL.addLast(7);

//        doubleLL.removeLast();
//        doubleLL.removeLast();
//        doubleLL.removeLast();

        //       doubleLL.insert(4,5);

        doubleLL.printList();
        doubleLL.printReverse();
        System.out.println(doubleLL.size());


    }
}

class DoubleLL {
    DoubleNode head = null;
    DoubleNode tail = null;
    int size = 0;


    //add first
    void addFirst(int data) {
        DoubleNode newNode = new DoubleNode(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            head.prev = null;
            tail.prev = null;
            size++;
            return;
        }
        head.prev = newNode;
        newNode.next = head;
        newNode.prev = null;
        head = newNode;
        size++;

    }

    int size() {
        return size;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addLast(int data) {

        if (tail == null) {
            addFirst(data);
            size++;
            return;
        }
        DoubleNode newNode = new DoubleNode(data);
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        size++;
    }

    void insert(int index, int data) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index for insertion");
            return;
        }
        if (size == 0 || index == 0) {
            addFirst(data);
            return;
        }
        DoubleNode temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        DoubleNode newNode = new DoubleNode(data, temp, temp.next);
        temp.next = newNode;
        size++;
    }

    void printList() {
        if (isEmpty()) {
            System.out.println("List is Empty");
            return;
        }
        DoubleNode current = head;
        while (current != null) {
            System.out.print(current.data + "<->");
            current = current.next;
        }
        System.out.println("NULL");
    }

    void printReverse() {
        if (isEmpty()) {
            System.out.println("List is Empty");
            return;
        }
        DoubleNode current = tail;
        while (current != null) {
            System.out.print(current.data + "<->");
            current = current.prev;
        }
        System.out.println("NULL");
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("List is Empty");
            return;
        }
        if (head == tail) {
            head = tail = null;
            size--;
            return;
        }
        head = head.next;
        head.prev = null;
        size--;
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("List is Empty");
            return;
        }
        if (head == tail) {
            head = tail = null;
            size--;
            return;
        }
        tail = tail.prev;
        tail.next = null;
        size--;
    }

}

class DoubleNode {
    int data;
    DoubleNode next;
    DoubleNode prev;

    public DoubleNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public DoubleNode(int data, DoubleNode prev, DoubleNode next) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}