package com.JavaDSA.Graphs.Path_finding;

import com.JavaDSA.Access_Control.A;

import java.util.*;
import java.util.ArrayList;

public class Dijkstra_algo {
        public static class Edge{
        int s;
        int d;
        int w;

        public Edge(int src, int des, int weight) {
            this.s=src;
            this.d = des;
            this.w = weight;
        }
    }

    public static void creategraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[3].add(new Edge(2, 4, 3));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));

    }
    public static class pair {
        int node;
        int path;

        pair(int n, int p) {
            this.node = n ;
            this.path =p;
        }
        }
    public static void Dijkstra(ArrayList<Edge> graph[]) {

    }

    public static void main(String[] args) {
        int v= 6;
        ArrayList<Edge> graph[] = new ArrayList[v];
        creategraph(graph);
        Dijkstra(graph);
    }

}
