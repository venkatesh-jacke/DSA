package gfg_2025;

public class SortedMerge {
    public static void main(String[] args) {

        int[] a1 = {5, 10, 15, 40};
        int[] a2 = {2, 3, 20};
        Node head1 = Node.buildLL(a1);
        Node head2 = Node.buildLL(a2);
        Node.printLL(sortedMerge(head1, head2));
    }

    static Node sortedMerge(Node head1, Node head2) {
        // code here
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }
        if (head1.data <= head2.data) {
            head1.next = sortedMerge(head1.next, head2);
            return head1;
        } else {
            head2.next = sortedMerge(head1, head2.next);
            return head2;
        }
    }
}
