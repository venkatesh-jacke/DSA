package gfg_2025.Tree;

import java.util.*;
//https://www.geeksforgeeks.org/problems/serialize-and-deserialize-a-binary-tree/1

public class SerializeDeSerialize_LevelOrder {
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
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node cur = q.poll();
            if (cur == null) {
                arr.add(null);
                continue;
            }
            arr.add(cur.data);
            q.add(cur.left);
            q.add(cur.right);

        }
        while (!arr.isEmpty() && arr.get(arr.size() - 1) == null) {
            arr.remove(arr.size() - 1);
        }
        return arr;
    }

    // Function to deserialize a list and construct the tree.
    static public Node deSerialize(ArrayList<Integer> arr) {
        if (arr == null || arr.isEmpty() || arr.get(0) == null) return null;
        Node root = new Node(arr.get(0));
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while (i < arr.size() && !q.isEmpty()) {
            Node cur = q.poll();
            if (i < arr.size() && arr.get(i) != null) {
                cur.left = new Node(arr.get(i));
                q.add(cur.left);
            }
            i++;
            if (i < arr.size() && arr.get(i) != null) {
                cur.right = new Node(arr.get(i));
                q.add(cur.right);
            }
            i++;
        }
        return root;
    }
}
