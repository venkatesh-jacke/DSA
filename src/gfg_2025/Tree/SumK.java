package gfg_2025.Tree;

//https://www.geeksforgeeks.org/problems/k-sum-paths/1

import java.util.ArrayList;

public class SumK {
    static int count;

    public static void main(String[] args) {

    }

    static public int sumK(Node root, int k) {
        // code here
        count=0;
        solve(root, k, new ArrayList<Integer>());
        return count;
    }

    public static void solve(Node root, int k, ArrayList<Integer> path) {
        if (root == null) return;
        path.add(root.data);
        int sum = 0;
        for (int i = path.size() - 1; i >= 0; i--) {
            sum += path.get(i);
            if (sum == k) {
                count++;
            }
        }
        solve(root.left, k, path);
        solve(root.right, k, path);
        path.remove(path.size() - 1);

    }
}
