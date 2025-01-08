package Tree.Recursion.Traversals;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Preorder {

    static List<Integer> result= new ArrayList<>();
    public static void main(String[] args) {
        Integer[] arr={1, 2, 3, 4, 5, 6, 7};
        TreeNode root= TreeNode.buildTree(arr);
        System.out.println(preOrder(root));
    }
    static List<Integer> preOrder(TreeNode root){
        if(root!=null){
            result.add(root.data);
            preOrder(root.left);
            preOrder(root.right);
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
