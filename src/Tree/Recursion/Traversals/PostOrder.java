package Tree.Recursion.Traversals;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PostOrder {

    static List<Integer> result= new ArrayList<>();
    public static void main(String[] args) {
        Integer[] arr={1, 2, 3, 4, 5, 6, 7};
        TreeNode root= TreeNode.buildTree(arr);
        System.out.println(postOrder(root));
    }
    static List<Integer> postOrder(TreeNode root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            result.add(root.data);
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

 PostOrder (Left-Right-Root)
 [4, 5, 2, 6, 7, 3, 1]

*/
