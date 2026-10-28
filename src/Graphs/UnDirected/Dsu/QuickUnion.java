package Graphs.UnDirected.Dsu;

// QuickUnion implementation of Disjoint Set Union (DSU)
// Used to efficiently manage connected components
public class QuickUnion {

    int[] root; // root[i] stores the parent of node i

    // Constructor: initialize each node as its own parent
    // Initially, all nodes are in separate components
    QuickUnion(int size) {
        root = new int[size];
        for (int i = 0; i < size; i++) {
            root[i] = i; // each node is its own root
        }
    }

    // FIND without path compression
    // Recursively finds the root (representative) of x
    int find(int x) {
        // If a node is its own parent, it is the root
        if (root[x] == x) {
            return x;
        }
        // Otherwise, keep going up the tree
        return find(root[x]);
    }

    // FIND with path compression (optimized)
    // Flattens the tree for faster future queries
    // Time complexity ~ O(logN) amortized (almost constant in practice)
    int findPathCompression(int x) {
        if (root[x] == x) {
            return x;
        }

        // Path compression:
        // Make the current node directly point to the root
        return root[x] = findPathCompression(root[x]);
    }

    // UNION operation
    // Connects two nodes by linking their roots
    // Time complexity ~ O(1) amortized (with path compression)
    void union(int x, int y) {
        int rootX = findPathCompression(x); // find root of x
        int rootY = findPathCompression(y); // find root of y

        // If they are in different components, connect them
        if (rootX != rootY) {
            // Make rootY point to rootX (merge the sets)
            root[rootY] = rootX;
        }
    }

    // Check if two nodes belong to the same component
    boolean isConnected(int x, int y) {
        return findPathCompression(x) == findPathCompression(y);
    }
}