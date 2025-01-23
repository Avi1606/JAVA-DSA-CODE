package com.JavaDSA.Graphs;
import java.util.*;
public class IsBipartite {


    //The time complexity is O(V + E) where V is the number of vertices and E is the number of edges, which is optimal for this problem.


    public static boolean isbaipartite( ArrayList<Graphs.Edge>[] graph){
        int colour [] = new int[graph.length];

        for (int i = 0; i < graph.length; i++) {
            colour[i] = -1;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < graph.length; i++) {//bfs
            if(colour[i] ==-1){//no colour
                q.add(i);
                colour[i] = 0; // assign yellow as default
                while(!q.isEmpty()){
                    int curr = q.remove();
                    for (int j = 0; j < graph[curr].size(); j++) {
                        Graphs.Edge  e = graph[curr].get(j); //neighbor
                        if(colour[e.des] == -1){
                            colour[e.des] = colour[curr] == 0 ? 1 : 0; // agr current ka colour 0 hai to neighbor ko 1 dedo vrna 0 dedo
                            q.add(e.des); // neighbor ko add krdiya last me
                        }
                        if(colour[curr] == colour[e.des]){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

}
