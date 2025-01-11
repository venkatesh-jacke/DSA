package Tree;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Integer[] arr = {10, 5, 15, 3, 7, null, 18};
        TreeNode bstRoot = TreeNode.buildBst(arr);
        System.out.println(TreeNode.printTree(bstRoot));
        TreeNode.inOrder(bstRoot);

    }


}
