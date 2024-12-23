package Graphs.Directed.AdjancyList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Dijkstra {
    static class Node implements Comparable<Node> {
        int vertex;
        int weight;

        public Node(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }


        @Override
        public int compareTo(Node o) {
            return Integer.compare(this.weight, o.weight);
        }

        @Override
        public String toString() {
            return "[" + this.vertex + " " + this.weight + "]";
        }
    }

    public static void main(String[] args) {
        List<List<Node>> graph = new ArrayList<>();
        int V = 5;
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(new Node(1, 10));
        graph.get(0).add(new Node(2, 2));
        graph.get(1).add(new Node(3, 4));
        graph.get(2).add(new Node(1, 3));
        graph.get(2).add(new Node(4, 1));
        graph.get(2).add(new Node(3, 6));
        graph.get(3).add(new Node(4, 10));
        for (List<Node> l : graph)
            System.out.println(l);
        dijkstra(graph, 0);
    }

    public static void dijkstra(List<List<Node>> graph, int src) {
        int V = graph.size();
        int[] dist = new int[V];
        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.weight - b.weight);
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        pq.add(new Node(src, 0));
        while (!pq.isEmpty()) {
            Node cur = pq.poll();
            int u = cur.vertex;
            for (Node neighbor : graph.get(u)) {
                int v = neighbor.vertex;
                int wt = neighbor.weight;
                if (dist[v] > dist[u] + wt) {
                    dist[v] = dist[u] + wt;
                    pq.add(new Node(v, dist[v]));
                }
            }

        }

        printSolution(V, dist);
    }


    private static void printSolution(int V, int[] dist) {
        System.out.println("Vertex\tDistance from Source");
        for (int i = 0; i < V; i++) {
            System.out.println(i + "\t\t" + dist[i]);
        }
    }
}
