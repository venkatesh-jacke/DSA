package Tree.Recursion;

import Tree.TreeNode;

public class IsMirror {
    public static void main(String[] args) {

        //Symmetric Tree
        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(2);
        tree1.right = new TreeNode(2);
        tree1.left.left = new TreeNode(3);
        tree1.left.right = new TreeNode(4);
        tree1.right.left = new TreeNode(4);
        tree1.right.right = new TreeNode(3);

        //Asymmetric Tree
        TreeNode tree2 = new TreeNode(1);
        tree2.left = new TreeNode(2);
        tree2.right = new TreeNode(2);
        tree2.left.left = new TreeNode(3);
        tree2.left.right = new TreeNode(4);
        tree2.right.right = new TreeNode(3);
        tree2.right.right.right = new TreeNode(5);
        if (tree2 == null) {
            System.out.println("Tree is Symmetric");
        } else {
            boolean isMirror = isMirror(tree2.left, tree2.right);
            System.out.println("Tree is " + (isMirror ? "Symmetric" : "Not Symmetric"));
        }

    }

    static boolean isMirror(TreeNode a, TreeNode b) {
        if (a == null && b == null) return true;
        if (a != null && b != null) return (a.data == b.data && isMirror(a.left, b.right) && isMirror(a.right, b.left));
        return false;
    }
}
/*
Tree 1

        1
       / \
      2   2
     / \ / \
    3  4 4  3


Tree 2

        1
       / \
      2   2
     / \
    3   4
   /     \
  5       3

 */
