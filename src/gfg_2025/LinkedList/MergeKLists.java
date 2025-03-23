package gfg_2025.LinkedList;

//https://www.geeksforgeeks.org/problems/merge-k-sorted-linked-lists/1

import gfg_2025.Node;

import java.util.List;
import java.util.PriorityQueue;

public class MergeKLists {
    public static void main(String[] args) {

    }
//    static Node mergeKLists(List<Node> arr) {
//        if (arr == null || arr.length == 0) return null;
//
//        // Min-Heap to store nodes based on their values
//        PriorityQueue<Node> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);
//
//        // Add first node of each list to the heap
//        for (Node list : arr) {
//            if (list != null) {
//                minHeap.add(list);
//            }
//        }
//
//        // Dummy node to help in merging
//        Node dummy = new Node(-1);
//        Node tail = dummy;
//
//        // Extract min node and add next nodes
//        while (!minHeap.isEmpty()) {
//            Node minNode = minHeap.poll(); // Get smallest node
//            tail.next = minNode;  // Attach to merged list
//            tail = tail.next;  // Move tail
//
//            if (minNode.next != null) {
//                minHeap.add(minNode.next);  // Add next node to heap
//            }
//        }
//
//        return dummy.next;
//    }
}
