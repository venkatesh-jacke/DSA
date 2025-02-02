package gfg_2025;


//https://www.geeksforgeeks.org/problems/add-two-numbers-represented-by-linked-lists/1

public class AddTwoLists {
    public static void main(String[] args) {
        Node.printLL(addTwoLists(Node.buildLL(new int[]{4, 5}), Node.buildLL(new int[]{3, 4, 5})));
    }

    static Node addTwoLists(Node num1, Node num2) {
        num1 = reverse(num1);
        num2 = reverse(num2);
        int carry = 0;
        Node dummy = new Node(-1);
        Node head = dummy;
        while (num1 != null || num2 != null || carry > 0) {
            int sum = carry;
            if (num1 != null) {
                sum += num1.data;
                num1 = num1.next;
            }
            if (num2 != null) {
                sum += num2.data;
                num2 = num2.next;
            }
            carry = sum / 10;
            dummy.next = new Node(sum % 10);
            dummy = dummy.next;
        }
        //remove trailing zeroes
        head = reverse(head.next);
        while (head.data == 0) {
            head = head.next;
        }
        return head;
    }

    static Node reverse(Node head) {
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
