package com.JavaDSA.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopoLogicalSort_BFS {
    public static class Edge{
        int src;
        int des;

        public Edge(int s, int d) {
            this.src = s;
            this.des = d;
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

    public static void cal_inged(ArrayList<Edge>[] graph, int indeg[]) {
        for (int i = 0; i < graph.length; i++) {
            int vertex = i; // this is for basic understanding
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                indeg[e.des]++;
            }
        }
    }

    public static void BFS(ArrayList<Edge>[] graph){
        int indegree[] = new int[graph.length];
        cal_inged(graph, indegree);
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < indegree.length; i++) {
            if (indegree[i] == 0) {
                q.add(i); //index hi meri value hai graph ki
            }
        }
        //bfs
        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr +" ");
            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                indegree[e.des]--;
                if (indegree[e.des] == 0) {
                    q.add(e.des);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int v =6;
        ArrayList<Edge>[] graph = new ArrayList[v];
        creategraph(graph);
        BFS(graph);
    }
}
