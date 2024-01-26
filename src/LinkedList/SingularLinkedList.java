package LinkedList;

import java.util.Stack;

public class SingularLinkedList {
    public static void main(String[] args) {
        SingularLL singularLL = new SingularLL();

        singularLL.addFirst(1);
        singularLL.addFirst(2);
        singularLL.addFirst(3);
        singularLL.addFirst(4);

//        singularLL.addLast(4);
//        singularLL.addLast(5);
//        singularLL.addLast(6);

//        singularLL.removeLast();
//        singularLL.removeLast();
//        singularLL.removeLast();
//        singularLL.removeLast();
//        singularLL.removeLast();
//        singularLL.removeLast();

//        singularLL.removeFirst();
//        singularLL.removeFirst();
//        singularLL.removeFirst();
//        singularLL.removeFirst();
//        singularLL.removeFirst();
//        singularLL.removeFirst();

//        singularLL.insert(0, 0);
//        singularLL.insert(1, 11);
//        singularLL.insert(4, 21);
        singularLL.printList();
       // singularLL.printReverseUsingStack();
        singularLL.printReverse();
        System.out.println(singularLL.size());


    }
}

class SingularLL {
    Node head = null;
    Node tail = null;
    int size = 0;


    //add first
    void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            size++;
            return;
        }
        newNode.next = head;
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
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
            size++;
            return;
        }
        tail.next = newNode;
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
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(data, temp.next);
        temp.next = newNode;
        size++;
    }

    void printList() {
        if (isEmpty()) {
            System.out.println("List is Empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("NULL");
    }

    void printReverseUsingStack() {
        if (isEmpty()) {
            System.out.println("List is Empty");
            return;
        }
        Stack<Node> stack = new Stack<>();

        // Push all nodes onto the stack
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        Node rev = new Node(Integer.MIN_VALUE);
        Node ptr = rev;
        while (!stack.isEmpty()) {
            ptr.next = new Node(stack.pop().data);
            ptr = ptr.next;

        }
        head = rev.next;
        printList();
    }
    void printReverse() {
        if (isEmpty()) {
            System.out.println("List is Empty");
            return;
        }
        if(head==tail){
            System.out.println(head.data);
            return;
        }
        Node prev=null;//new head
        Node current=head;
        Node next=null;
        while(current!=null){
            next=current.next;//store the next node
            current.next=prev; // remove the link
            prev=current; //move the new head
            current=next; // iterate through all node
        }
        head=prev;
        printList();
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
        size--;
        head = head.next;
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
        Node current = head;
        while (current.next != tail) {
            current = current.next;
        }
        current.next = null;
        tail = current;
        size--;
    }

}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}