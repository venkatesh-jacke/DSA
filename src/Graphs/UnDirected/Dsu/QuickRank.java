package Graphs.UnDirected.Dsu;

public class QuickRank {
    int root[];
    int rank[];

    QuickRank(int size) {
        root = new int[size];
        rank = new int[size];
        for (int i = 0; i < size; i++) {
            root[i] = i;
            rank[i] = 1;
        }
    }

    //O(logN)
    int find(int x) {
        if (root[x] == x) return x;
        return find(root[x]);
    }

    //O(1)
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
            if (rank[rootX] > rank[rootY]) {
                root[rootY] = rootX;
            } else if (rank[rootY] > rank[rootX]) {
                root[rootX] = rootY;
            } else {
                root[rootY] = rootX;
                rank[rootX] += 1;
            }
        }
    }

    boolean isConnected(int x, int y) {
        return findPathCompression(x) == findPathCompression(y);
    }
}
