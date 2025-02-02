package gfg_2025;


//https://www.geeksforgeeks.org/problems/reverse-a-linked-list-in-groups-of-given-size/1

public class ReverseKGroup {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 5, 6, 7, 8};
        Node head = Node.buildLL(arr);
        int k = 4;
        Node.printLL(reverseKGroup(head, k));
    }

    public static Node reverseKNodes(Node head, int k) {
        Node curr = head;
        Node prev = null;
        Node next = null;
        int count = 0;

        while (curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        return prev;
    }

    // Recursive function to reverse in groups of K
    static Node reverseKGroup(Node head, int k) {
        if (head == null) {
            return head;
        }

        Node temp = head;
        int count = 0;
        while (temp != null && count < k) {
            temp = temp.next;
            count++;
        }

        Node groupHead = reverseKNodes(head, k);

        // Recursion for the next group
        head.next = reverseKGroup(temp, k);

        return groupHead;
    }

}
