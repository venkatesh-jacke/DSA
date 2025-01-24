package gfg_2025;


//https://www.geeksforgeeks.org/problems/detect-loop-in-linked-list/1

public class DetectLoop {
    public static void main(String[] args) {

    }
    public static boolean detectLoop(Node head) {
        // Add code here
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) return true;

        }
        return false;

    }
}
