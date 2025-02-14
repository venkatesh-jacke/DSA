package gfg_2025.Tree;

import java.util.*;
//https://www.geeksforgeeks.org/problems/inorder-traversal/1

public class Inorder {
    static ArrayList<Integer> res;

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        Node root = Node.buildTree(arr);
        System.out.println(inOrder(root));
    }

    static ArrayList<Integer> inOrder(Node root) {
        res = new ArrayList<>();
        rec(root);
        return res;
    }

    static ArrayList<Integer> inOrder2(Node root) {
        res = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        Node cur = root;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left; //move left
            }
            cur = stack.pop(); //process root
            res.add(cur.data);
            cur = cur.right; //move to right
        }
        return res;
    }

    static Node rec(Node root) {
        if (root == null) return null;
        rec(root.left);
        res.add(root.data);
        rec(root.right);
        return root;
    }
}
