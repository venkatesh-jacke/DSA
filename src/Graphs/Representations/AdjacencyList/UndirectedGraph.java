package Graphs.Representations.AdjacencyList;

import java.util.*;

public class UndirectedGraph {
    public static void main(String[] args) {
        int n = 6;
        //int[][] edges = {{0, 1}, {0, 3}, {0, 4}, {1, 2}, {5, 3}, {5, 4}};
        int[][] edges = {{0, 2}, {0, 3}, {0, 1}, {2, 4}};
        Map<Integer, ArrayList<Integer>> graph = createGraph(n, edges);
        // System.out.println(graph);
        System.out.println("BFS Traversal for given graph is ");
        bfs(graph, n, 0, new boolean[n]);
        System.out.println();
        System.out.println("DFS Traversal for given graph is ");
        dfs(graph, 0, new boolean[n]);
        System.out.println();
        System.out.println("DFS Traversal for given graph is ");
        dfs2(graph, 0, new boolean[n]);
        ;

    }

    static private Map<Integer, ArrayList<Integer>> createGraph(int n, int[][] edges) {
        Map<Integer, ArrayList<Integer>> graph = new HashMap<>();
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            //Since it's a bidirectional graph mark both opposites
            graph.computeIfAbsent(u, value -> new ArrayList<>()).add(v);
            graph.computeIfAbsent(v, value -> new ArrayList<>()).add(u);
        }
        return graph;
    }

    static void bfs(Map<Integer, ArrayList<Integer>> graph, int n, int source, boolean[] visited) {
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        visited[source] = true;
        while (!q.isEmpty()) {
            int current = q.remove();
            System.out.print(current + " ");
            for (int neighbor : graph.get(current)) {
                if (!visited[neighbor]) {
                    q.add(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
    }

    static void dfs(Map<Integer, ArrayList<Integer>> graph, int source, boolean[] visited) {
        Stack<Integer> stack = new Stack<>();
        stack.push(source);
        while (!stack.isEmpty()) {
            int current = stack.pop();
            visited[current] = true;
            System.out.print(current + " ");
            // Push neighbors in reverse order to maintain DFS order
            for (int i = graph.get(current).size() - 1; i >= 0; i--) {
                int neighbor = graph.get(current).get(i);
                if (!visited[neighbor]) {
                    stack.push(neighbor);
                }
            }
        }
    }

    static void dfs2(Map<Integer, ArrayList<Integer>> graph, int cur, boolean[] vis) {
        vis[cur] = true;
        System.out.print(cur + " ");
        for (int i = 0; i < graph.get(cur).size(); i++) {
            if (!vis[graph.get(cur).get(i)]) {
                dfs2(graph, graph.get(cur).get(i), vis);
            }
        }
    }

}
