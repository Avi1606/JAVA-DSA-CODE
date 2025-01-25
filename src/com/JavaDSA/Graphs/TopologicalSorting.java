package com.JavaDSA.Graphs;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSorting {

    public static class Edge {

        int src;
        int des;

        public Edge(int s, int des) {
            this.src = s;
            this.des = des;
        }
    }

    public static void creategraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
    }

    public static void TopoLogicalSort(ArrayList<Edge>[] graph) {
        boolean visit[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < graph.length; i++) {
            if(!visit[i]){
                TopologicalSortingUtil(graph , visit , i , s);
            }
        }

        while (!s.isEmpty()) {
            System.out.print(s.pop()+" ");
        }
    }

    private static void TopologicalSortingUtil(ArrayList<Edge>[] graph , boolean visit[] , int curr,Stack<Integer> s) {
        visit[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if (!visit[e.des]) {
                TopologicalSortingUtil(graph , visit , e.des , s);
            }
        }
        s.push(curr);
    }

    public static void main(String[] args) {
        int v= 6;
        ArrayList<Edge> []graph = new ArrayList[v];
        creategraph(graph);
        TopoLogicalSort(graph);
    }
}
