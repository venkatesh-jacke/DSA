package Recursion.LinedList;

public class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    public ListNode(int val,ListNode next) {
        this.val = val;
        this.next =next;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    static void printLL(ListNode head){
        while(head!=null){
            System.out.print(head.val+"->");
            head=head.next;
        }
        System.out.println("NULL");
    }
}
