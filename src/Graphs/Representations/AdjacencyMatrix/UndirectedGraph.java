package Graphs.Representations.AdjacencyMatrix;

import java.util.*;

public class UndirectedGraph {
    public static void main(String[] args) {
        int n = 6;
        int[][] edges = {{0, 1}, {0, 3}, {0, 4}, {1, 2}, {5, 3}, {5, 4}};
        boolean[][] graph = createGraph(n, edges);
//       for(int i=0;i<graph[0].length;i++){
//           System.out.println(Arrays.toString(graph[i]));
//        }
        System.out.println("BFS Traversal for given graph is ");
        bfs(graph, n, 0, new boolean[n]);
        System.out.println();
        System.out.println("DFS Traversal for given graph is ");
        dfs(graph, n, 0, new boolean[n]);
        System.out.println();
        System.out.println("DFS Traversal for given graph is ");
        dfs2(graph, n, 0, new boolean[n]);

    }

    private static boolean[][] createGraph(int n, int[][] edges) {
        boolean[][] graph = new boolean[n][n];
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph[u][v] = true;
            graph[v][u] = true;
        }
        return graph;
    }

    static void bfs(boolean[][] graph, int n, int source, boolean[] visited) {
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        visited[source] = true;
        while (!q.isEmpty()) {
            int current = q.remove();
            System.out.print(current);
            for (int i = 0; i < n; i++) {
                if (graph[current][i] == true && !visited[i]) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    static void dfs(boolean[][] graph, int n, int source, boolean[] visited) {
        Stack<Integer> stack = new Stack<>();
        stack.push(source);
        while (!stack .isEmpty()) {
            int current = stack.pop();
            visited[source] = true;
            System.out.print(current);
            for (int i = 0; i < n; i++) {
                if (graph[current][i] == true && !visited[i]) {
                    stack.push(i);
                    visited[i] = true;
                }
            }
        }
    }

    static void dfs2(boolean[][] graph, int n, int current, boolean[] visited) {
        System.out.print(current);
        visited[current]=true;
        for(int i=0;i<n;i++){
            if(graph[current][i]&&!visited[i]){
                dfs2(graph,n,i,visited);
            }
        }
    }

}
