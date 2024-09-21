package Graphs.Representations.AdjacencyList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DirectedGraph {
    public static void main(String[] args) {
        int n = 3;
        int[][] edges = {{0, 1}, {1, 2}, {0, 2}};
        Map<Integer, ArrayList<Integer>> graph = createGraph(n, edges);
        System.out.println(graph);
    }
    static private Map<Integer, ArrayList<Integer>> createGraph(int n, int[][] edges) {
        Map<Integer, ArrayList<Integer>> graph = new HashMap<>();
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            graph.computeIfAbsent(u,value->new ArrayList<>()).add(v);

        }
        return graph;
    }


}

//n=3 0 1 2