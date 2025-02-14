package gfg_2025.Tree;

import java.util.*;

//https://www.geeksforgeeks.org/problems/find-k-th-smallest-element-in-bst/1

public class KthSmallest {
    public static void main(String[] args) {
        Integer[] arr = {2, 1, 3};
        int k = 2;
        Node root = Node.buildTree(arr);
        System.out.println(kthSmallestInorder(root, k));
    }

    // Return the Kth smallest element in the given BST
    static public int kthSmallest(Node root, int k) {
        // Write your code here
        List<Integer> list = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node cur = q.poll();
            list.add(cur.data);
            if (cur.left != null)
                q.add(cur.left);
            if (cur.right != null)
                q.add(cur.right);
        }
        Collections.sort(list);
        if (list.size() < k - 1) return -1;
        return list.get(k - 1);
    }

    static public int kthSmallestInorder(Node root, int k) {
        int[] cnt = new int[1];
        return rec(root, cnt, k);
    }

    //Inorder is left node right
    static public int rec(Node root, int[] cnt, int k) {
        if (root == null) return -1; //if value not found
        int left = rec(root.left, cnt, k); //process left
        if (left != -1) return left; // If kth smallest is found in left
        cnt[0]++;// increment the node count
        if (cnt[0] == k) return root.data; //Process the root data
        int right = rec(root.right, cnt, k);
        return right;


    }

}
/*
    The idea is to traverse the binary search tree using in-order traversal
    while maintaining the count of nodes traversed. If the node count becomes equal to k,
    then return the node.
*/
