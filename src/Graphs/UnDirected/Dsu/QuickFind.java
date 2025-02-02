package Graphs.UnDirected.Dsu;

public class QuickFind {
    int[] root;

    QuickFind(int size) {
        root = new int[size];
        for (int i = 0; i < size; i++) {
            root[i] = i;
        }
    }

    void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY) {
            for(int i=0;i<root.length;i++){
                if(root[i]==rootY){
                    root[i]=rootX;
                }
            }
        }
    }

    private int find(int x) {
        return root[x];
    }

    boolean isConnected(int x, int y) {
        return find(x) == find(y);
    }
}
