package Recursion.LinedList;

public class MergeTwoSortedLL {
    public static void main(String[] args) {
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        headA.next.next = new ListNode(3);

        ListNode headB = new ListNode(4);
        headB.next = new ListNode(5);
        headB.next.next = new ListNode(6);

        ListNode.printLL(mergeLL(headA,headB));

    }

    static ListNode mergeLL(ListNode headA, ListNode headB) {
        if(headA==null) return headB;
        if(headB==null) return headA;

        if(headA.val<headB.val){
            headA.next= mergeLL(headA.next,headB);
            return headA; //we assume that after merging with remaining items in A we return headA
        }
        else{
            headB.next=mergeLL(headA,headB.next);
            return headB; //we assume that after merging with remaining items in B we return headB
        }
    }
}
