package Graphs.Representations.AdjacencyList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UndirectedGraph {
    public static void main(String[] args) {
        int n = 3;
        int[][] edges = {{0, 1}, {1, 2}, {2, 0}};
        Map<Integer, ArrayList<Integer>> graph = createGraph(n, edges);
        System.out.println(graph);
    }

    static private Map<Integer, ArrayList<Integer>> createGraph(int n, int[][] edges) {
        Map<Integer, ArrayList<Integer>> graph = new HashMap<>();
       for(int[] edge:edges){
           int u=edge[0];
           int v=edge[1];

           //Since it's a bidirectional graph mark both opposites
           graph.computeIfAbsent(u,value->new ArrayList<>()).add(v);
           graph.computeIfAbsent(v,value->new ArrayList<>()).add(u);
       }
        return graph;
    }
}
