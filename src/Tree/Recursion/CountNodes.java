package Tree.Recursion;

import Tree.TreeNode;

public class CountNodes {

    static int fullNode = 0;
    static int halfNode = 0;
    static int leafNode = 0;

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.left.left = new TreeNode(7);
        root.right.right = new TreeNode(6);
        root.right.right.right = new TreeNode(6);

        countNodes(root);
        System.out.println("FullNode is "+fullNode);
        System.out.println("HalfNode is "+halfNode);
        System.out.println("LeafNode is "+leafNode);
    }

    static void countNodes(TreeNode root){
        if(root==null) return;
        else if(root.left!=null && root.right!=null) fullNode++;
        else if(root.left!=null || root.right!=null) halfNode++;
        else leafNode++;
        countNodes(root.left);
        countNodes(root.right);
    }
}
