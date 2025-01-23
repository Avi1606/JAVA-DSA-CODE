package com.JavaDSA.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_DFS {

    public static void creategraph(ArrayList<Graphs.Edge> []graph){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
    }
    public static void bfs(ArrayList<Graphs.Edge>[] graph){
        boolean visit [] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if(!visit[i]){
                bfsutil(graph , visit);
            }
        }
    }
    public static void bfsutil(ArrayList<Graphs.Edge>[] graph , boolean visit[]) {
        Queue<Integer> q = new LinkedList<>();
        q.add(0);

        while (!q.isEmpty()) {
            int curr = q.remove();

            if (!visit[curr]) {
                System.out.println(curr);
                visit[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Graphs.Edge e = graph[curr].get(i);
                    q.add(e.des);
                }
            }
        }
    }

    public static void dfs(ArrayList<Graphs.Edge> graph[]){
        boolean visit [] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if(!visit[i]){
                dfsutil(graph ,i, visit);
            }
        }
    }

    public static void dfsutil(ArrayList<Graphs.Edge> graph[], int curr, boolean visit[]){
        System.out.println(curr + " ");//visit

        visit[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Graphs.Edge e = graph[curr].get(i);
            if(!visit[curr]){
                dfsutil(graph , e.des , visit);
            }
        }

    }
}

