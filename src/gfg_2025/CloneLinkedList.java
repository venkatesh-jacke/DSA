package gfg_2025;


//https://www.geeksforgeeks.org/problems/clone-a-linked-list-with-next-and-random-pointer/1
//https://www.youtube.com/watch?v=q570bKdrnlw

import java.util.HashMap;

public class CloneLinkedList {
    public static void main(String[] args) {
        // Creating the linked list [[1, 3], [3, 3], [5, NULL], [9, 3]]
        Node node1 = new Node(1);
        Node node2 = new Node(3);
        Node node3 = new Node(5);
        Node node4 = new Node(9);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        node1.random = node2; // 1 -> 3
        node2.random = node2; // 3 -> 3
        node3.random = null; // 5 -> NULL
        node4.random = node2; // 9 -> 3

        System.out.println("Original list:");
        Node.printLL(node1);

        Node copiedHead = cloneLinkedList_HashMap(node1);

        System.out.println("\nCopied list:");
        Node.printLL(copiedHead);
    }




    //Time O(n) Space O(n)
    static public Node cloneLinkedList_HashMap(Node head) {

        HashMap<Node, Node> map = new HashMap<>();
        Node cur = head;
        while (cur != null) {
            map.put(cur, new Node(cur.data));
            cur = cur.next;
        }
        System.out.println(map);
        cur = head;
        while (cur != null) {
            Node copy = map.get(cur);
            copy.next = map.get(cur.next);
            copy.random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(head);
    }

}
