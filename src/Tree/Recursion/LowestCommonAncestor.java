package Tree.Recursion;

import Tree.TreeNode;

public class LowestCommonAncestor {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        root.left = left;
        root.right = right;
        left.left = new TreeNode(4);
        left.right = new TreeNode(5);
        right.left = new TreeNode(6);
        right.right = new TreeNode(7);

        TreeNode p = new TreeNode(6);
        TreeNode q = new TreeNode(7);
        System.out.println(lca(p, q, root));
    }


    static TreeNode lca(TreeNode p, TreeNode q, TreeNode root) {
        if (root == null) return null;
        if (root.equals(p) || root.equals(q)) return root;
        TreeNode left = lca(p, q, root.left);
        TreeNode right = lca(p, q, root.right);
        if (left != null && right != null) return root;
        return (left != null) ? left : right;
    }
}
/*

        1
       / \
      2   3
     / \ / \
    4  5 6  7


*/
