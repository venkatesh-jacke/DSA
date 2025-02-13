package gfg_2025.Tree;

//https://www.geeksforgeeks.org/problems/find-a-pair-with-given-target-in-bst/1

import java.util.*;

public class FindTarget {
    static HashMap<Integer, Integer> map;
    static HashSet<Integer> set;

    public static void main(String[] args) {
        Integer[] arr = {1};
        Node root = Node.buildTree(arr);
        int target = 2;
        System.out.println(findTarget(root, target));
    }


    static boolean findTarget(Node root, int target) {
        // Write your code here
        map = new HashMap<>();

        inorder(root);
        for (int key : map.keySet()) {
            int complement = target - key;
            if (map.containsKey(complement)) {
                if (key == complement && map.get(complement) < 2) {
                    return false;
                }
                return true;
            }
        }
        return false;

    }


    static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        map.put(root.data, map.getOrDefault(root.data, 0) + 1);
        set.add(root.data);
        inorder(root.right);
    }
}
