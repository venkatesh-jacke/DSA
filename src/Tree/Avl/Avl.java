package Tree.Avl;

import Tree.TreeNode;

public class Avl {
    public static void main(String[] args) {
        Integer[] avlArray = {10, 20, 30, 40, 50, 25};
        TreeNode avlTree = TreeNode.buildBst(avlArray); // Balancing happens during insertion
        System.out.print("AVL Tree (InOrder Traversal): ");
        TreeNode.inOrder(avlTree);
        System.out.println();
        System.out.println("AVL Tree (Level Order): " + TreeNode.printTree(avlTree));
    }
}
