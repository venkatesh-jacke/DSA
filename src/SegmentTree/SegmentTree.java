package SegmentTree;

public class SegmentTree {

    // Represents each node in the Segment Tree
    static class Node {
        int data;               // Sum of this interval
        int startInterval;      // Start index of interval
        int endInterval;        // End index of interval

        Node left;
        Node right;

        Node(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

    private Node root;

    // Build the segment tree
    public SegmentTree(int[] arr) {
        root = constructTree(arr, 0, arr.length - 1);
    }

    // Recursively construct the tree
    private Node constructTree(int[] arr, int start, int end) {

        // Leaf node
        if (start == end) {
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }

        Node node = new Node(start, end);

        int mid = start + (end - start) / 2;

        node.left = constructTree(arr, start, mid);
        node.right = constructTree(arr, mid + 1, end);

        // Parent stores the sum of its children
        node.data = node.left.data + node.right.data;

        return node;
    }

    // Display the tree
    private void display(Node node) {

        if (node == null)
            return;

        StringBuilder sb = new StringBuilder();

        if (node.left != null) {
            sb.append("Interval [")
                    .append(node.left.startInterval)
                    .append("-")
                    .append(node.left.endInterval)
                    .append("] = ")
                    .append(node.left.data);
        } else {
            sb.append("No Left Child");
        }

        sb.append(" => Interval [")
                .append(node.startInterval)
                .append("-")
                .append(node.endInterval)
                .append("] = ")
                .append(node.data)
                .append(" <= ");

        if (node.right != null) {
            sb.append("Interval [")
                    .append(node.right.startInterval)
                    .append("-")
                    .append(node.right.endInterval)
                    .append("] = ")
                    .append(node.right.data);
        } else {
            sb.append("No Right Child");
        }

        System.out.println(sb);

        display(node.left);
        display(node.right);
    }

    public void display() {
        display(root);
    }

    //================ QUERY ===================//

    public int query(int qsi, int qei) {
        return query(root, qsi, qei);
    }

    // Returns the sum in the range [qsi, qei]
    private int query(Node node, int qsi, int qei) {

        // Completely inside
        if (node.startInterval >= qsi && node.endInterval <= qei) {
            return node.data;
        }

        // Completely outside
        if (node.startInterval > qei || node.endInterval < qsi) {
            return 0;
        }

        // Partial overlap
        return query(node.left, qsi, qei)
                + query(node.right, qsi, qei);
    }

    //================ UPDATE ===================//

    public void update(int index, int value) {
        update(root, index, value);
    }

    // Updates arr[index] = value
    // Returns the updated sum of the current interval
    private int update(Node node, int index, int value) {

        // Index not present in this interval
        if (index < node.startInterval || index > node.endInterval) {
            return node.data;
        }

        // Leaf node
        if (node.startInterval == node.endInterval) {
            node.data = value;
            return node.data;
        }

        // Update left and right child
        int leftSum = update(node.left, index, value);
        int rightSum = update(node.right, index, value);

        // Recalculate current node
        node.data = leftSum + rightSum;

        return node.data;
    }

}