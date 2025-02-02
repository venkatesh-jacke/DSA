package gfg_2025;

import java.util.HashSet;

public class Node {
    int data;
    Node next;
    Node random;

    Node(int value) {
        this.data = value;
    }

    static void printLL(Node head) {
        HashSet<Node> seen = new HashSet<>();
        while (head != null) {
            if (seen.contains(head)) {
                System.out.print("[cycle at " + head.data + "]");
                break;
            }
            System.out.print(head.data + "->");
            seen.add(head);
            head = head.next;
        }
        if (head == null) {
            System.out.print("Null");
        }
        System.out.println();
    }

    static Node buildLL(int[] arr, int loopIndex) {
        if (arr.length < 1) return null;
        Node head = new Node(arr[0]);
        Node cur = head;
        Node loopNode = null;
        if (loopIndex == 0) {
            loopNode = head;
        }
        for (int i = 1; i < arr.length; i++) {
            cur.next = new Node(arr[i]);
            cur = cur.next;
            if (i == loopIndex) {
                loopNode = cur;
            }
        }
        if (loopIndex >= 0) {
            cur.next = loopNode;
        }
        return head;
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

    @Override
    public String toString() {
        return this.data + "";
    }
}
