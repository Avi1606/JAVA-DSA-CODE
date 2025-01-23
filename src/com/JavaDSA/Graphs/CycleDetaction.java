package com.JavaDSA.Graphs;
import java.util.*;
public class CycleDetaction {

    public boolean Cycledetation(ArrayList<Graphs.Edge> graph []){
        boolean visit [] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!visit[i]) {
                if(Cycledetationutil(graph, visit, i, -1)){     //-1 isiliye kyoki starting point ka to koi parent mji hoga
                    return true;
                }
            }
        }
        return false;
    }


    private boolean Cycledetationutil(ArrayList<Graphs.Edge> [] graph , boolean visit[] , int current , int parent){
        visit[current] = true;

        for (int i = 0; i < graph.length; i++) {
            Graphs.Edge e  = graph[current].get(i);
            //case 3
            if(!visit[e.des] ){
                if( Cycledetationutil(graph ,visit , e.des,current)){
                    return true;
                }

            }
            //case 2
            else if(!visit[e.des] && e.des!= parent){
                return true;
            }
            // case 3 do nothing -> continue
        }
        return false;
    }


}
