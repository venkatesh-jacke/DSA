package Tree.Interative;

import Tree.TreeNode;

import java.util.*;

public class PostOrder {

    static List<Integer> result = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        root.left = left;
        root.right = right;
        left.left = new TreeNode(4);
        left.right = new TreeNode(5);
        right.left = new TreeNode(6);
        right.right = new TreeNode(7);
        System.out.println(postOrder(root));
    }

    static List<Integer> postOrder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        TreeNode previous=null;
        while (current != null || !stack.isEmpty()) {
            // Traverse to the leftmost node
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            // Check if the right subtree needs to be visited or the current node should be processed
            TreeNode peekNode = stack.peek();
            if (peekNode.right != null && peekNode.right != previous) {
                // Visit the right subtree
                current = peekNode.right;
            } else {
                // Process the current node and backtrack
                result.add(peekNode.data);
                previous = stack.pop();
            }
        }
        return result;
    }

    public static class LevelOrder {
        static List<Integer> result = new ArrayList<>();

        public static void main(String[] args) {
            TreeNode root = new TreeNode(1);
            TreeNode left = new TreeNode(2);
            TreeNode right = new TreeNode(3);
            root.left = left;
            root.right = right;
            left.left = new TreeNode(4);
            left.right = new TreeNode(5);
            right.left = new TreeNode(6);
            right.right = new TreeNode(7);
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
