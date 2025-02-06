package gfg_2025.Tree;


//https://www.geeksforgeeks.org/problems/construct-tree-1/1

import java.util.HashMap;

public class BuildTree {
    static int preIndex;
    static HashMap<Integer, Integer> map;

    public static void main(String[] args) {
        int[] inOrder = {3, 1, 4, 0, 2, 5};
        int[] preOrder = {0, 1, 3, 4, 2, 5};
        Node.printTree(buildTree(inOrder,preOrder));
    }

    public static Node buildTree(int inorder[], int preorder[]) {
        preIndex = 0;
        map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return construct(preorder, 0, inorder.length - 1);
    }

    public static Node construct(int[] preOrder, int start, int end) {
        if (start > end) return null;
        int rootVal = preOrder[preIndex++];
        Node root = new Node(rootVal);
        int inIndex = map.get(rootVal);
        root.left = construct(preOrder, start, inIndex - 1);
        root.right = construct(preOrder, inIndex + 1, end);
        return root;
    }
}
