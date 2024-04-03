package Tree.Interative;

import Tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

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
        root.right.right.right = new TreeNode(8);

        countNodes(root);
        System.out.println("FullNode is "+fullNode);
        System.out.println("HalfNode is "+halfNode);
        System.out.println("LeafNode is "+leafNode);
    }

    static void countNodes(TreeNode root){
        Queue<TreeNode> queue= new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode cur= queue.remove();
            if(cur.left!=null && cur.right!=null){
                fullNode++;
                queue.add(cur.left);
                queue.add(cur.right);
            }
            else if(cur.left!=null && cur.right==null){
                halfNode++;
                queue.add(cur.left);
            }
            else if(cur.left==null && cur.right!=null){
                halfNode++;
                queue.add(cur.right);
            }
            else {
                leafNode++;
            }
        }
    }
}

/*
          1
         / \
        2   3
       /   / \
      4   5   6
         /     \
        7       8

FullNode is 2
HalfNode is 3
LeafNode is 3


*/
