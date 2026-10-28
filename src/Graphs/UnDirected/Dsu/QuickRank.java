package Graphs.UnDirected.Dsu;

// Optimized Disjoint Set Union (DSU)
// Uses:
// 1. Path Compression (for fast find)
// 2. Union by Rank (to keep tree shallow)
public class QuickRank {

    int root[]; // parent of each node
    int rank[]; // approx height (depth) of the tree

    // Constructor: initialize each node as its own parent
    QuickRank(int size) {
        root = new int[size];
        rank = new int[size];

        for (int i = 0; i < size; i++) {
            root[i] = i;   // each node is its own root
            rank[i] = 1;   // initial height = 1
        }
    }

    // FIND without path compression
    // Traverses up the tree to find root
    // Worst case: O(log N) with rank optimization
    int find(int x) {
        if (root[x] == x) return x;

        return find(root[x]);
    }

    // FIND with path compression (optimized)
    // Flattens the tree for future queries
    // Amortized: ~O(1)
    int findPathCompression(int x) {
        if (root[x] == x) {
            return x;
        }

        // Make node point directly to root
        return root[x] = findPathCompression(root[x]);
    }

    // UNION using rank
    // Always attach smaller tree under bigger tree
    // Keeps height minimal
    // Amortized: ~O(1)
    void union(int x, int y) {

        int rootX = findPathCompression(x); // root of x
        int rootY = findPathCompression(y); // root of y

        // If already in same set, do nothing
        if (rootX != rootY) {

            // Attach smaller tree under larger tree
            if (rank[rootX] > rank[rootY]) {

                root[rootY] = rootX; // Attach Y's root under X's root → X becomes the parent (leader) of Y's tree

            } else if (rank[rootY] > rank[rootX]) {

                root[rootX] = rootY; // Attach X's root under Y's root → Y becomes the parent (leader) of X's tree

            } else {
                // Same rank → pick one as parent and increase its rank
                root[rootY] = rootX; // Attach Y's root under X's root → X becomes the parent (leader) of Y's tree
                rank[rootX] += 1;
            }
        }
    }

    // Check if two nodes are in same component
    boolean isConnected(int x, int y) {
        return findPathCompression(x) == findPathCompression(y);
    }
}