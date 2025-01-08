package Tree.Interative.Traversals;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrder {

    static List<Integer> result= new ArrayList<>();
    public static void main(String[] args) {
        Integer[] arr={1, 2, 3, 4, 5, 6, 7};
        TreeNode root= TreeNode.buildTree(arr);
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
