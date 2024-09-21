package Tree.Recursion;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Inorder {

    static List<Integer> result= new ArrayList<>();
    public static void main(String[] args) {
        Integer[] arr={1, 2, 3, 4, 5, 6, 7};
        TreeNode root= TreeNode.buildTree(arr);
        System.out.println(inOrder(root));
    }
    static List<Integer> inOrder(TreeNode root){
        if(root!=null){
            inOrder(root.left);
            result.add(root.data);
            inOrder(root.right);
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

