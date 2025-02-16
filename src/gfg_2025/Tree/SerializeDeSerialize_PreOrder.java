package gfg_2025.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
//https://www.geeksforgeeks.org/problems/serialize-and-deserialize-a-binary-tree/1

public class SerializeDeSerialize_PreOrder {
    public static void main(String[] args) {
        Integer[] arr = {1, 6, null, 6, null, null, null};
        Node root = Node.buildTree(arr);
        ArrayList<Integer> serialize = serialize(root);
        System.out.println("Serialized: " + serialize);
        Node deSerialize = deSerialize(serialize);
        System.out.print("DeSerialized: ");
        Node.inOrder(deSerialize);


    }

    static public ArrayList<Integer> serialize(Node root) {
        ArrayList<Integer> arr = new ArrayList<>();
        preOrderSerialize(root, arr);
        return arr;
    }

    private static void preOrderSerialize(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            arr.add(-1);
            return;
        }
        arr.add(root.data);
        preOrderSerialize(root.left, arr);
        preOrderSerialize(root.right, arr);
    }

    // Function to deserialize a list and construct the tree.
    static public Node deSerialize(ArrayList<Integer> arr) {
        int[] i = {0};
        return preOrderDeSerializer(arr, i);
    }

    private static Node preOrderDeSerializer(ArrayList<Integer> arr, int[] i) {
        if (arr.get(i[0]) == -1) {
            i[0]++;
            return null;
        }
        Node root = new Node(arr.get(i[0]));
        i[0]++;
        root.left = preOrderDeSerializer(arr, i);
        root.right = preOrderDeSerializer(arr, i);
        return root;

    }
}
