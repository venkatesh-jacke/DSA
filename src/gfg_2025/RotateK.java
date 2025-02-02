package gfg_2025;


//https://www.geeksforgeeks.org/problems/rotate-a-linked-list/1

public class RotateK {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next.next = new Node(70);
        int k = 4;
        Node.printLL(rotate(head, k));
    }

    static public Node rotate(Node head, int k) {
        // add code here
        if (k == 0 || head == null) return head;
        int len = 1;
        Node cur = head;
        while (cur.next != null) {
            cur = cur.next;
            len++;
        }
        k %= len;
        if (k == 0) return head;
        cur.next = head;
        cur = head;
        for (int i = 1; i < k; i++)
            cur = cur.next;
        head = cur.next;
        cur.next = null;
        return head;
    }
}
