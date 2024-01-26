package LinkedList;

public class CircularLinkedList {
    public static void main(String[] args) {
        CircularLL circularNode = new CircularLL();
        circularNode.add(1);
        circularNode.add(2);
        circularNode.add(3);
        circularNode.add(4);
        circularNode.delete(3);
        circularNode.printList();


    }

}

class CircularLL {
    CircularNode head = null;
    CircularNode tail = null;
    int size;

    boolean isEmpty() {
        return head == null;
    }

    void add(int data) {
        CircularNode newNode = new CircularNode(data);
        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
        size++;
    }

    void printList() {
        if (isEmpty()) {
            System.out.println("List is Empty");
            return;
        }
        CircularNode current = head;
        do {
            System.out.print(current.data + "->");
            current = current.next;
        } while (current != head);
        System.out.print(current.data);  //To show you its a circular last element will pint to first element current is head now

    }

    void delete(int data){
        CircularNode current=head;
        if (isEmpty()) {
            System.out.println("List is Empty");
            return;
        }
        if(current.data==data){
            head=head.next;
            tail.next=head;
            return;
        }

       do{
           CircularNode temp=current.next;
           if(temp.data==data){
               current.next=temp.next;
               break;
           }
           current=current.next;
       }while(current!=head);

    }
}

class CircularNode {
    int data;
    CircularNode next;

    public CircularNode(int data) {
        this.data = data;
        this.next = null;
    }
}
