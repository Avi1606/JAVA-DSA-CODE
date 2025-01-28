package com.JavaDSA.Graphs.Path_finding;

import com.JavaDSA.Graphs.TopoLogicalSort_BFS;

import java.util.ArrayList;

public class Src_to_target {
    private static class Edge{
        int src;
        int des;

        public Edge(int s, int d) {
            this.src =s;
            this.des =d;
        }
    }

    public static void creategraph(ArrayList<Edge>graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,3));
        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
    }

    public static void pathfind(ArrayList<Edge> graph[] , int src , int target , String p) {
        if (src == target) {
            System.out.println(p+target);
            return;
        }

        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            pathfind(graph , e.des ,target , p+src);
        }
    }

    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge> graph[] = new ArrayList[v];
        creategraph(graph);
        pathfind(graph,5,1 ,"");
    }
}
