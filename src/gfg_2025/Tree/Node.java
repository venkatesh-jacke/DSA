package gfg_2025.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return this.data + "";
    }

    public static Node buildTree(Integer[] arr) {
        if (arr == null || arr[0] == null) return null;
        Node root = new Node(arr[0]);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while (!q.isEmpty() && i < arr.length) {
            Node cur = q.poll();
            if (i < arr.length && arr[i] != null) {
                cur.left = new Node(arr[i]);
                q.add(cur.left);
            }
            i++;
            if (i < arr.length && arr[i] != null) {
                cur.right = new Node(arr[i]);
                q.add(cur.right);
            }
            i++;
        }
        return root;
    }

    public static List<Integer> printTree(Node root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node cur = q.poll();
            if (cur != null) {
                res.add(cur.data);
                q.add(cur.left);
                q.add(cur.right);
            } else {
                res.add(null);
            }
        }
        while (!res.isEmpty() && res.get(res.size() - 1) == null) {
            res.remove(res.size() - 1);
        }
        return res;
    }
}
