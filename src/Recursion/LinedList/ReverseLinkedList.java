package Recursion.LinedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        ListNode.printLL(reverseLL(head));
    }

    static ListNode reverseLL(ListNode head) {

        if(head==null||head.next==null) return head;
        ListNode p= reverseLL(head.next);  //p holds the last element
        head.next.next=head;  //making a cycle with current -> next > current
        head.next=null; //remove the link  current -> next ->
        return p;  //return the head which is last elemnt

    }
}
