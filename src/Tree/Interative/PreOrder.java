package Tree.Interative;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrder {

    static List<Integer> result= new ArrayList<>();
    public static void main(String[] args) {
        TreeNode root= new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        root.left=left;
        root.right=right;
        left.left= new TreeNode(4);
        left.right= new TreeNode(5);
        right.left= new TreeNode(6);
        right.right= new TreeNode(7);
        System.out.println(preOrder(root));
    }
    static List<Integer> preOrder(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current= root;
        while(current!=null || !stack.isEmpty()){
            while(current!=null){
                result.add(current.data); //add the root
                stack.push(current);
                current=current.left;  //move to left
            }
            current=stack.pop();
            current=current.right;  // move to right

        }
        return result;
    }
}
/*
Binary-Tree
       1
      / \
     2   3
    / \ / \
   4  5 6  7

 PreOrder (Root-Left-Right)
[1, 2, 4, 5, 3, 6, 7]

*/
