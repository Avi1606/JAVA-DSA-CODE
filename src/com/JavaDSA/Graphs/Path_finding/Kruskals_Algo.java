package com.JavaDSA.Graphs.Path_finding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Kruskals_Algo {
    public static class Edge implements Comparable<Edge> {
        int src;
        int des;
        int wt;

        public Edge(int s, int d, int wt) {
            this.src = s;
            this.des = d;
            this.wt = wt;
        }

        @Override
        public int compareTo(Edge e2) {
            return this.wt - e2.wt;
        }
    }
    public static void creategraph(ArrayList<Edge> edges) {
        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 15));
        edges.add(new Edge(0, 3, 30));
        edges.add(new Edge(1, 3, 40));
        edges.add(new Edge(2, 3, 50));
    }

    static int vertices = 4;
    static int parent[] = new int[vertices];
    static int rank[] = new int[vertices];

    public static void init() {
        for (int i = 0; i < vertices; i++) {
            parent[i] = i;
        }
    }

    public static int find(int x) {
        if (parent[x] == x) {
            return x;
        }
        return parent[x] = find(parent[x]);
    }

    public static void union(int x, int y) {
        int parentA= find(x);
        int parentB = find(y);

        if (rank[parentA] == rank[parentB]) {
            parent[parentB] = parentA;
            rank[parentA]++;
        } else if (rank[parentA] > rank[parentB]) {
            parent[parentB] = parentA;
        }else{
            parent[parentA] = parentB;
        }
    }

    public static int Kruskals(ArrayList<Edge> edges, int vertices) {
        init();
        Collections.sort(edges);
        int minCost = 0;
        for (Edge e : edges) {
            if (find(e.src) != find(e.des)) {
                union(e.src, e.des);
                minCost += e.wt;
            }
        }
        return minCost;
    }
    public static void main(String[] args) {
        ArrayList<Edge> edges = new ArrayList<>();
        creategraph(edges);
        int mstCost = Kruskals(edges, vertices);
        System.out.println("The cost of the Minimum Spanning Tree is: " + mstCost);
    }
}


