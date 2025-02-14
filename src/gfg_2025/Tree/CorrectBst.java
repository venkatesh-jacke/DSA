package gfg_2025.Tree;

//https://www.geeksforgeeks.org/problems/fixed-two-nodes-of-a-bst/1

public class CorrectBst {
    static Node first, middle, prev, last;

    public static void main(String[] args) {
        Integer[] arr = {10, 5, 8, 2, 20};
        Node root = Node.buildTree(arr);
        correctBST(root);
        Node.printTree(root);
    }

    public static void correctBST(Node root) {
        // code here.
        first = middle = last = null;
        prev = new Node(Integer.MIN_VALUE);
        inOrder(root);
        if (first != null && last != null) {
            int temp = first.data;
            first.data = last.data;
            last.data = temp;
        }
        else{
            int temp = first.data;
            first.data = middle.data;
            middle.data = temp;
        }
    }

    public static void inOrder(Node root) {
        if (root == null) return;
        inOrder(root.left);
        if (prev != null && (root.data < prev.data)) {
            if (first == null) {
                first = prev;
                middle = root;
            } else {
                last = root;
            }
        }
        prev = root;
        inOrder(root.right);
    }


}
