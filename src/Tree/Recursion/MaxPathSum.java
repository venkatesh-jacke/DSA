package Tree.Recursion;

import Tree.TreeNode;

public class MaxPathSum {

    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        TreeNode left = new TreeNode(9);
        TreeNode right = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        TreeNode root = new TreeNode(-10, left, right);
        maxPathSum(root);
        System.out.println(max);
    }

    static int maxPathSum(TreeNode root) {
        if (root == null) return 0;
        int left = Math.max(0, maxPathSum(root.left));  //max sum start from left child if its -ve we consider 0
        int right = Math.max(0, maxPathSum(root.right)); //max sum start from right child if its -ve we consider 0
        int currentSum = root.data + left + right;  //total sum we get by adding both left right and current
        max = Math.max(currentSum, max);
        return Math.max(root.data + left, root.data + right); //return max sum possible by left or right child

    }
}
/*
       -10
      /    \
     9      20
           /  \
         15    7
*/
