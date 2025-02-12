package gfg_2025.Tree;

//https://www.geeksforgeeks.org/problems/check-for-bst/1

public class IsBST {
    public static void main(String[] args) {
        Integer[] arr = {};
        Node root = Node.buildTree(arr);
        System.out.println();
    }

    static public boolean isBst(Node root) {
        return rec(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static boolean rec(Node root, int min, int max) {
        if (root == null) return true;
        if (root.data < min || root.data > max) return false;
        return rec(root.left, min, root.data - 1) && rec(root.right, root.data + 1, max);
    }
}
