package com.JavaDSA.Graphs;

import java.util.ArrayList;

import static com.JavaDSA.Graphs.BFS_DFS.creategraph;
import static com.JavaDSA.Graphs.BFS_DFS.dfs;
import static com.JavaDSA.Graphs.HasPath.haspath;

public class Main {
    public static void main(String[] args) {
//            int v=7;
//
//            ArrayList<Graphs.Edge>[] graph = new ArrayList[v];

        int v=5;

        ArrayList<Graphs.Edge>[] graph = new ArrayList[v];// ye null hai abhi to defined nhi hi ki isme kya type ka data aayega to hm vo krenge ab define

        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }


        graph[0].add(new Graphs.Edge(0, 1, 5));

        graph[1].add(new Graphs.Edge(1, 0, 5));
        graph[1].add(new Graphs.Edge(1, 2, 1));
        graph[1].add(new Graphs.Edge(1, 3, 3));

        graph[2].add(new Graphs.Edge(2, 1, 1));
        graph[2].add(new Graphs.Edge(2, 3, 1));
        graph[2].add(new Graphs.Edge(2, 4, 4));

        graph[3].add(new Graphs.Edge(3, 1, 3));
        graph[3].add(new Graphs.Edge(3, 2, 1));

        graph[4].add(new Graphs.Edge(4, 2, 2));

//        graph[0].add(new Graphs.Edge(0, 1));
//        graph[1].add(new Graphs.Edge(1, 0));
//
//        graph[1].add(new Graphs.Edge(1, 2));
//        graph[2].add(new Graphs.Edge(2, 1));
//
//        graph[2].add(new Graphs.Edge(2, 3));
//        graph[3].add(new Graphs.Edge(3, 2));
//
//        graph[3].add(new Graphs.Edge(3, 4));
//        graph[4].add(new Graphs.Edge(4, 3));
//
//        graph[4].add(new Graphs.Edge(4, 1));
//        graph[1].add(new Graphs.Edge(1, 4));


        // 3 ke neighbors
        for (int i = 0; i < graph[3].size(); i++) {
            Graphs.Edge e = graph[3].get(i);
            System.out.println("the neighbor is " +e.des);
        }
        creategraph(graph);

        dfs(graph);
        System.out.println(haspath(graph, 0, 4, new boolean[v]));

    }
}
