package gfg_2025.Tree;

//https://www.geeksforgeeks.org/problems/lowest-common-ancestor-in-a-bst/1

public class LCA {
    public static void main(String[] args) {
        Integer[] arr = {5, 4, 6, 3, null, null, 7, null, null, null, 8};
        Node root = Node.buildTree(arr);


    }

    static Node LCA(Node root, Node n1, Node n2) {
        // your code here.
        if (root == null) return null;
        // If both n1 and n2 are smaller, search in the left subtree
        if (root.data < n1.data && root.data < n2.data) {
            return LCA(root.left, n1, n2);
            // If both n1 and n2 are greater, search in the right subtree
        } else if (root.data > n1.data && root.data > n2.data) {
            return LCA(root.right, n1, n2);
        }
        return root; // If n1 and n2 are on different sides or one is the root, return root
    }
}
