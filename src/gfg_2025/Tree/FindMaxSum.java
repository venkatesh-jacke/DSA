package gfg_2025.Tree;

//https://www.geeksforgeeks.org/problems/maximum-path-sum-from-any-node/1

public class FindMaxSum {
    static int maxSum =  Integer.MIN_VALUE;

    public static void main(String[] args) {
        Integer[] arr = {10, 2, 10, 20, 1, null, -25, null, null, null, null, 3, 4};
        Node root = Node.buildTree(arr);

        System.out.println(findMaxSum(root));
    }

    static int findMaxSum(Node node) {
        // your code goes here
        solve(node);
        return maxSum;
    }

    static int solve(Node root) {
        if (root == null) return 0;
        int leftGain = Math.max(solve(root.left),0);
        int rightGain = Math.max(solve(root.right),0);
        // Calculate the path sum that passes through the current node.
        int currentPathSum = root.data + leftGain + rightGain;
        maxSum = Math.max(maxSum, currentPathSum);
        return root.data + Math.max(leftGain, rightGain); //return either left or right path
    }
}
