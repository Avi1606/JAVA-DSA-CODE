package com.JavaDSA.Graphs;

import java.util.ArrayList;

public class HasPath {

    public static boolean haspath(ArrayList<Graphs.Edge> graph [] , int src , int des , boolean visit[]){
        if(src == des){
            return true;
        }
        visit[src] = true;
        for(int i=0 ; i<graph[src].size(); i++){
            Graphs.Edge e = graph[src].get(i); // e.des == neigbor
            if(!visit[e.des] && haspath(graph , e.des , des , visit)){
                return true;
            }
        }

        return false;
    }
}
