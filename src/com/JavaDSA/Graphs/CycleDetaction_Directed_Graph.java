package com.JavaDSA.Graphs;
import java.util.*;
public class CycleDetaction_Directed_Graph {

    public static boolean IsCycle(ArrayList<Graphs.Edge> [] graphs){
        boolean visit[] = new boolean[graphs.length];
        boolean stack[] = new boolean[graphs.length];

        for (int i = 0; i < graphs.length; i++) {
            if(!visit[i]){
                if(IsCycleutil(graphs , visit , stack ,i));{
                    return true;
                }
            }
        }
        return false;


    }

    private static boolean IsCycleutil(ArrayList<Graphs.Edge>[] graphs, boolean visit[], boolean stack[], int curr) {
        visit[curr] = true;
        stack[curr] = true;

        for (int i = 0; i < graphs[curr].size(); i++) {
            Graphs.Edge e = graphs[curr].get(i);
            if (stack[e.des]) { // agr padosi or ka index true hai mtlb vo alredy visited hain to cucle haii
                return true;
            }
            if (!visit[curr] && IsCycleutil(graphs, visit, stack, e.des)) {
                return true;
            }
        }
        stack[curr] = false;
        return false;
    }
}
