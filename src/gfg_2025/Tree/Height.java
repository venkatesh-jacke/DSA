package gfg_2025.Tree;


//https://www.geeksforgeeks.org/problems/height-of-binary-tree/1

public class Height {
    public static void main(String[] args) {
        Integer[] arr = {12, 8, 18, 5, 11};
        Node root = Node.buildTree(arr);
        System.out.println(height(root));
    }


    //Height based on no of edges
    public static int height(Node node) {
        // code here
        if (node == null) {
            return -1; //empty subtree has height -1
        }
        return Math.max(height(node.left), height(node.right)) + 1;
    }
}
