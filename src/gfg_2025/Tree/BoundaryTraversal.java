package gfg_2025.Tree;

import java.util.ArrayList;

//https://www.geeksforgeeks.org/problems/boundary-traversal-of-binary-tree/1

public class BoundaryTraversal {
    static ArrayList<Integer> result;

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, null, null, 8, 9, null, null, null, null};
        Node root = Node.buildTree(arr);
        System.out.println(boundaryTraversal(root));
    }

    static boolean isLeaf(Node node) {
        return node.left == null && node.right == null;
    }

    static ArrayList<Integer> boundaryTraversal(Node node) {
        result = new ArrayList<>();
        if (!isLeaf(node))
            result.add(node.data);
        addLeftBoundary(node.left);
        addLeaves(node);
        addRightBoundary(node.right);
        return result;
    }

    static void addLeftBoundary(Node node) {
        while (node != null) {
            if (!isLeaf(node)) {
                result.add(node.data);
            }
            //Prefer left subTree
            if (node.left != null) {
                node = node.left;
            } else {
                node = node.right;
            }
        }
    }

    static void addLeaves(Node node) {
        if (node == null) return;
        if (isLeaf(node)) {
            result.add(node.data);
        }
        addLeaves(node.left);
        addLeaves(node.right);
    }

    static void addRightBoundary(Node node) {
        ArrayList<Integer> temp = new ArrayList<>();
        while (node != null) {
            if (!isLeaf(node)) {
                temp.add(node.data);
            }
            //Prefer right subTree
            if (node.right != null) {
                node = node.right;
            } else {
                node = node.left;
            }
        }
        for (int i = temp.size() - 1; i >= 0; i--) {
            result.add(temp.get(i));
        }
    }
}
