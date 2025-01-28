package gfg_2025;

//https://www.geeksforgeeks.org/problems/find-the-first-node-of-loop-in-linked-list--170645/1


public class FindFirstNode {
    public static void main(String[] args) {
        Node head = Node.buildLL(new int[]{1, 3, 2, 4, 5}, 1);
        Node loopNode = findFirstNode(head);
        if (loopNode != null) {
            System.out.println("First node in the cycle: " + loopNode.data);
        } else {
            System.out.println("No cycle detected.");
        }
    }

    public static Node findFirstNode(Node head) {

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
                return slow;
            }
        }

        return null;
    }
}
