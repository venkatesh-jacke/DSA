package gfg_2025;

//https://www.geeksforgeeks.org/problems/remove-loop-in-linked-list/1


public class RemoveLoop {
    public static void main(String[] args) {
        Node head = Node.buildLL(new int[]{1, 2, 3, 4}, 0);
        Node.printLL(head);
        removeLoop(head);
        //System.out.println();
        Node.printLL(head);

    }

    public static void removeLoop(Node head) {
        // code here
        if (head == null || head.next == null) return;
        Node loopNode = null;
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                loopNode = slow;
                break;
            }
        }
        if (loopNode == null) return;
        Node temp = loopNode;
        while (temp.next != loopNode) {
            temp = temp.next;
        }
        temp.next = null;

    }
}
