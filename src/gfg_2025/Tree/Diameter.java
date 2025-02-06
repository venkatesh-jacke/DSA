package gfg_2025.Tree;


//https://www.geeksforgeeks.org/problems/diameter-of-binary-tree/1

public class Diameter {
    public static void main(String[] args) {
        Integer[] arr = {5, 8, 6, 3, 7, 9};
        Node root = Node.buildTree(arr);
        System.out.println(diameter(root));
    }

    static int diameter(Node root) {
        // Your code here
        int[] res = new int[1];
        rec(root, res);
        return res[0];

    }

    static int rec(Node root, int[] res) {
        if (root == null) return 0; //if null heeight is 0
        int leftHeight = rec(root.left, res);
        int rightHeight = rec(root.right, res);
        //Update the diameter Max(previous diameter, left+right subtree)
        res[0] = Math.max(res[0], leftHeight + rightHeight);
        return 1 + Math.max(leftHeight, rightHeight); //return max height of left/right subtree
    }
}
