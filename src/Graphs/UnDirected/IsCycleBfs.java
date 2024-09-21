package Graphs.UnDirected;


import java.util.*;

public class IsCycleBfs {

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(1)),
                new ArrayList<>(Arrays.asList(0, 2, 4)),
                new ArrayList<>(Arrays.asList(1, 3)),
                new ArrayList<>(Arrays.asList(2, 4)),
                new ArrayList<>(Arrays.asList(1, 3))
        ));
        System.out.println(isCycle(V, adj));
    }

    static class Pair {
        int node;
        int parent;

        public Pair(int node, int parent) {
            this.node = node;
            this.parent = parent;
        }
    }

    // Function to detect cycle in an undirected graph.
    static public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean visited[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (bfs(adj, i, visited)) return true;
            }
        }
        return false;
    }
    

    static boolean bfs(ArrayList<ArrayList<Integer>> graph, int src, boolean[] visited) {
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(src, -1));
        visited[src] = true;
        while (!queue.isEmpty()) {
            Pair current = queue.poll();
            int currentNode = current.node;
            int parentNode = current.parent;
            for (int neighbor : graph.get(currentNode)) {
                if (!visited[neighbor]) {
                    queue.add(new Pair(neighbor, currentNode));
                    visited[neighbor] = true;
                } else if (neighbor != parentNode) {
                    return true;
                }
            }
        }
        return false;
    }


}
