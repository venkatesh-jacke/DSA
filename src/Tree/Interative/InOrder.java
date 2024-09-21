package Tree.Interative;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrder  {

    static List<Integer> result= new ArrayList<>();
    public static void main(String[] args) {
        Integer[] arr={1, 2, 3, 4, 5, 6, 7};
        TreeNode root= TreeNode.buildTree(arr);
        System.out.println(inOrder(root));
    }
    static List<Integer> inOrder(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current= root;
        while(current!=null || !stack.isEmpty()){
            while(current!=null){
                stack.push(current);
                current=current.left; //Move to the left subtree
            }
            current=stack.pop(); //Process the root node
            result.add(current.data);
            current=current.right; // Move to right subtree
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

InOrder (Left-Root-Right)
[4, 2, 5, 1, 6, 3, 7]

*/