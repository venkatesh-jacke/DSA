package Tree;


public class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(){

    }
    TreeNode(int data){
        this.data=data;
    }
    TreeNode(int data,TreeNode left,TreeNode right){
        this.data=data;
        this.left=left;
        this.right=right;
    }
}
