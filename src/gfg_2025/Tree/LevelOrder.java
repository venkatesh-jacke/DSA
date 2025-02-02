package gfg_2025.Tree;


import java.util.*;

//https://www.geeksforgeeks.org/problems/level-order-traversal/1

public class LevelOrder {
    static ArrayList<ArrayList<Integer>> res;

    public static void main(String[] args) {
        Integer[] arr = {10, 20, 30, 40, 50};
        Node root = Node.buildTree(arr);
        System.out.println(levelOrder(root));
    }

    static public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // Your code here
        res = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node cur = q.poll();
                temp.add(cur.data);
                if (cur.left != null) q.add(cur.left);
                if (cur.right != null) q.add(cur.right);
            }
            res.add(temp);
        }
        return res;
    }
}
