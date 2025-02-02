package gfg_2025;

//https://www.geeksforgeeks.org/problems/reverse-a-linked-list/1

public class ReverseList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        Node.printLL(reverseList(head));
    }

    static Node reverseList(Node head) {
        Node prev = null;
        Node cur = head;

        while (cur != null) {
            Node next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }

}
