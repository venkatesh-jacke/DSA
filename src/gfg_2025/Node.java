package gfg_2025;

public class Node {
    int data;
    Node next;

    Node(int value) {
        this.data = value;
    }

    static void PrintLL(Node head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.print("Null");
    }

    static Node buildLL(int[] arr) {
        if (arr.length < 1) return null;
        Node head = new Node(arr[0]);
        Node cur = head;
        for (int i = 1; i < arr.length; i++) {
            cur.next = new Node(arr[i]);
            cur = cur.next;
        }
        return head;
    }
}
