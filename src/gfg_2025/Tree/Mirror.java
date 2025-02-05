package gfg_2025.Tree;


//https://www.geeksforgeeks.org/problems/mirror-tree/1

import java.util.LinkedList;
import java.util.Queue;

public class Mirror {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, null, null, 4};
        Node root = Node.buildTree(arr);
        Node.printTree(root);
        mirror(root);
        Node.printTree(root);

    }


    //bfs
    public static void mirror(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node cur = q.poll();
            Node temp=cur.left;
            cur.left=cur.right;
            cur.right=temp;
            if (cur.left != null)
                q.add(cur.left);
            if (cur.right != null)
                q.add(cur.right);

        }
    }


    //rec
    public static void mirror_rec(Node root) {
        if (root == null) return;
        mirror(root.left);
        mirror(root.right);
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}
