package Graphs.Directed.AdjacencyMatrix;

import java.util.Arrays;

public class Dijkstra {
    public static void main(String[] args) {
        int graph[][] = new int[][]{
                {0, 0, 1, 2, 0, 0, 0},
                {0, 0, 2, 0, 0, 3, 0},
                {1, 2, 0, 1, 3, 0, 0},
                {2, 0, 1, 0, 0, 0, 1},
                {0, 0, 3, 0, 0, 2, 0},
                {0, 3, 0, 0, 2, 0, 1},
                {0, 0, 0, 1, 0, 1, 0}
        };
        int graph2[][] = new int[][]{
                {0, 4, 0, 0, 0, 0, 0, 8, 0},
                {4, 0, 8, 0, 0, 0, 0, 11, 0},
                {0, 8, 0, 7, 0, 4, 0, 0, 2},
                {0, 0, 7, 0, 9, 14, 0, 0, 0},
                {0, 0, 0, 9, 0, 10, 0, 0, 0},
                {0, 0, 4, 14, 10, 0, 2, 0, 0},
                {0, 0, 0, 0, 0, 2, 0, 1, 6},
                {8, 11, 0, 0, 0, 0, 1, 0, 7},
                {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };
        dijkstra(graph2, 0);
    }

    public static void dijkstra(int[][] graph, int src) {
        int V = graph.length;
        int[] dis = new int[V];
        Arrays.fill(dis, Integer.MAX_VALUE);
        boolean[] vis = new boolean[V];
        dis[src] = 0;
        for (int vertex = 0; vertex < V; vertex++) {
            int u = minDistance(dis, vis); //take vertex with minimum distance
            vis[u] = true; //mark the vertex as visited
            for (int v = 0; v < V; v++) {  //go through all the neighbor vertex
                //if neighbor not visited and there is a edge chk the minimum distance
                if (!vis[v] && graph[u][v] != 0 && dis[u] != Integer.MAX_VALUE && dis[v] > dis[u] + graph[u][v]) {
                    dis[v] = dis[u] + graph[u][v]; //put the minimum distance to that vertex from source
                }
            }
        }
        printSolution(V, dis, src);

    }

    private static void printSolution(int V, int[] dis, int src) {
        System.out.println("Vertex \t\t Distance from Source");
        for (int i = 0; i < V; i++)
            System.out.println(i + " \t\t " + dis[i]);
    }


    //Utility function to pull out the minimum vertex that not yet visited
    public static int minDistance(int[] dis, boolean[] vis) {
        int min_val = Integer.MAX_VALUE, min_idx = -1;
        for (int v = 0; v < dis.length; v++) {
            if (!vis[v] && dis[v] <= min_val) {
                min_idx = v;
                min_val = dis[v];
            }
        }
        return min_idx; //return vertex with minimum weight
    }
}
