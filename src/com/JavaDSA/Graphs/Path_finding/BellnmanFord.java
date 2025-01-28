package com.JavaDSA.Graphs.Path_finding;

import java.util.ArrayList;

public class BellnmanFord {
    public static class Edge {
        int src;
        int des;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.des = d;
            this.wt = w;
        }
    }

    public static void creategraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));

    }

    public static void Bellmanford(ArrayList<Edge> graph[], int src) {
        int distance[] = new int[graph.length];
        for (int i = 0; i < distance.length; i++) {
            if (i != src) { // inicialize all the edges value with infinity except src
                distance[i] = Integer.MAX_VALUE; //+ infinity
            }
        }

        // algorithm
        int vertices = graph.length;
        for (int i = 0; i < vertices; i++) {

            for (int j = 0; j < graph.length; j++) {
                for (int k = 0; k < graph[j].size(); k++) {
                    Edge e = graph[j].get(k);
                    int u = e.src;
                    int v = e.des;
                    int wt = e.wt;
                    if (distance[u]!= Integer.MAX_VALUE && distance[v] > distance[u] + wt) {
                        distance[v] = distance[u] + wt;
                    }
                }
            }
        }
        //print

        for (int i : distance) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        creategraph(graph);
        Bellmanford(graph ,0);
    }
}
