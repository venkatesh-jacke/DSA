package gfg;

public class Node {
    int data;
    Node next;
    Node(int value) {
        this.data = value;
    }
    static void PrintLL(Node head){
        while(head!=null){
            System.out.print(head.data+"->");
            head=head.next;
        }
        System.out.print("Null");
    }
}
