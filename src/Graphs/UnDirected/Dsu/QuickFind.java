package Graphs.UnDirected.Dsu;

// QuickFind implementation of Disjoint Set Union (DSU)
// Focus: Fast "find", but slow "union"
public class QuickFind {

    int[] root; // root[i] represents the component id of node i

    // Constructor: initialize each node in its own component
    QuickFind(int size) {
        root = new int[size];
        for (int i = 0; i < size; i++) {
            root[i] = i; // each node starts in its own group
        }
    }

    // UNION operation
    // Merge the components of x and y
    void union(int x, int y) {

        int rootX = find(x); // component id of x
        int rootY = find(y); // component id of y

        // If they belong to different components, merge them
        if (rootX != rootY) {

            // Go through entire array and change all entries
            // that belong to rootY into rootX
            for (int i = 0; i < root.length; i++) {

                // If node i belongs to y's component
                if (root[i] == rootY) {

                    // Move it to x's component
                    root[i] = rootX;
                }
            }
        }
    }

    // FIND operation
    // Returns the component id of x
    // This is O(1) because we directly store component id
    private int find(int x) {
        return root[x];
    }

    // Check if two nodes are in the same component
    boolean isConnected(int x, int y) {
        return find(x) == find(y);
    }
}