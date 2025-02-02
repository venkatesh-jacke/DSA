package Graphs.UnDirected.Dsu;

public class QuickUnion {
    int[] root;

    QuickUnion(int size) {
        root = new int[size];
        for (int i = 0; i < size; i++) {
            root[i] = i;
        }
    }

    int find(int x) {
        if (root[x] == x) {
            return x;
        }
        return find(root[x]);
    }

    //O(logN)
    int findPathCompression(int x) {
        if (root[x] == x) {
            return x;
        }
        return root[x] = findPathCompression(root[x]);
    }


    //O(1)
    void union(int x, int y) {
        int rootX = findPathCompression(x);
        int rootY = findPathCompression(y);
        if (rootX != rootY) {
            root[rootY] = rootX;
        }
    }

    boolean isConnected(int x, int y) {
        return findPathCompression(x) == findPathCompression(y);

    }
}
