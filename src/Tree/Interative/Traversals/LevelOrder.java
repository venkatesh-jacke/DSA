package Tree.Interative.Traversals;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder  {
    static List<Integer> result = new ArrayList<>();

    public static void main(String[] args) {
        Integer[] arr={1, 2, 3, 4, 5, 6, 7};
        TreeNode root= TreeNode.buildTree(arr);
        System.out.println(levelOrder(root));
    }

    static List<Integer> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int temp = queue.size(); //calculate queue size for each level
            while (temp > 0) {
                TreeNode cur = queue.remove();
                result.add(cur.data);
                if (cur.left != null) queue.add(cur.left); //add only if there is left child
                if (cur.right != null) queue.add(cur.right);    //add only if there is right child
                temp--;
            }
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

LevelOrder is level by level
[1, 2, 3, 4, 5, 6, 7]

*/