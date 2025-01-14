package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNode {
    public int data;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.data = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.data = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return (this.data) + "";
    }


    //Method to print the tree [root,root.left,root.right,root.left.left,root.right.right
    public static List<Integer> printTree(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();

            if (cur != null) {
                list.add(cur.data);
                queue.add(cur.left);
                queue.add(cur.right);
            } else {
                list.add(null);
            }
        }

        // Remove trailing nulls that represent missing nodes in the complete binary tree representation
        while (!list.isEmpty() && list.get(list.size() - 1) == null) {
            list.remove(list.size() - 1);
        }

        return list;
    }

    //Method to build Binary Tree
    public static TreeNode buildTree(Integer[] arr) {
        if (arr.length == 0 || arr[0] == null) return null;
        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while (!queue.isEmpty() && i < arr.length) {
            TreeNode cur = queue.poll();
            if (i < arr.length && arr[i] != null) {
                cur.left = new TreeNode(arr[i]);
                queue.add(cur.left);
            }
            i++;
            if (i < arr.length && arr[i] != null) {
                cur.right = new TreeNode(arr[i]);
                queue.add(cur.right);
            }
            i++;

        }
        return root;
    }

    public static int height(TreeNode node) {
        if (node == null) return 0;
        return Math.max(height(node.left), height(node.right)) + 1;
    }


    //Method to build Binary Search Tree
    public static TreeNode buildBst(Integer[] arr) {
        if (arr == null || arr.length == 0) return null;
        TreeNode root = null;
        for (Integer i : arr) {
            if (i != null) {
                root = insertIntoBst(root, i);
            }
        }
        return root;

    }

    private static TreeNode insertIntoBst(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val < root.data) {
            root.left = insertIntoBst(root.left, val);
        } else {
            root.right = insertIntoBst(root.right, val);
        }
        //return root;
        return rotate(root);
    }

    private static TreeNode rotate(TreeNode node) {
        if (node == null) return null;

        int balance = height(node.left) - height(node.right);

        if (balance > 1) {
            // Left heavy
            if (height(node.left.left) < height(node.left.right)) {
                // Left-right case
                node.left = leftRotate(node.left);
            }
            // Left-Left case
            return rightRotate(node);

        } else if (balance < -1) {
            // Right heavy
            if (height(node.right.right) < height(node.right.left)) {
                // Right-Left case
                node.right = rightRotate(node.right);
            }
            // Right-Right case
            return leftRotate(node);

        }

        return node; // Already balanced
    }


    // Left rotate the tree rooted at node
    private static TreeNode leftRotate(TreeNode c) {
        TreeNode p = c.right;
        c.right = p.left;
        p.left = c;
        return p;
    }

    // Right rotate the tree rooted at node
    private static TreeNode rightRotate(TreeNode p) {
        TreeNode c = p.left;
        p.left = c.right;
        c.right = p;
        return c;
    }


    //InOrder (left-root-right)
    public static void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
}
