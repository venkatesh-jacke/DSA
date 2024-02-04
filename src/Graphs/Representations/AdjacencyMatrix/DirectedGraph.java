package Graphs.Representations.AdjacencyMatrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DirectedGraph {
    public static void main(String[] args) {
        int n = 3;
        int[][] edges = {{0, 1}, {1, 2}, {0, 2}};
        boolean[][] graph = createGraph(n, edges);
        for(int i=0;i<graph[0].length;i++){
            System.out.println(Arrays.toString(graph[i]));
        }
    }

    private static boolean[][] createGraph(int n, int[][] edges) {
        boolean[][]  graph= new boolean[n][n];
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            graph[u][v]=true;
        }
        return graph;
    }

}
