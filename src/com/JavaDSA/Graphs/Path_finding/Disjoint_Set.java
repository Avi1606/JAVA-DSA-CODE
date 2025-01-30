package com.JavaDSA.Graphs.Path_finding;

public class Disjoint_Set {
    static int  v=7;
    static int parent[] = new int[v];
    static int rank[] = new int[v];

    public static void init() {
        for (int i = 0; i < v; i++) {
            parent[i] = i;
        }
    }

    public static int find(int x) {
        if (parent[x] == x) {
            return x;
        }
        return find(parent[x]);
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


    public static void main(String[] args) {
        init();
        union(0,1);
        union(1,2);
        union(2,3);
        union(4,5);
        union(5,6);
        union(6,4);
        System.out.println(find(3));
        System.out.println(find(6));
    }
}
