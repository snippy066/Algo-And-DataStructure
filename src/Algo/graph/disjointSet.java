package Algo.graph;

import java.util.Scanner;

public class disjointSet {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);

        int v = sc.nextInt();
        int e = sc.nextInt();

        Graph gr = new Graph(v, e);
        String[] s = sc.nextLine().split(" ");
        for (int i = 0; i < e; i++) {
            gr.edge[i].src = s[i];
            gr.edge[i].des = s[i + 1];
        }

        if (isCycle(gr) == true)
            System.out.println("graph contains cycle");
        else
            System.out.println("graph doesn't contain cycle");

    }
}

class Graph{
    int E ,V;
    Edge edge[];

    class Edge{
        int src,des;
    };

    Graph(int ver, int edg){
        V=ver;
        E=edg;

        edge=new Edge[E];

        for(int i=0;i<E;i++)  edge[i]=new Edge();
    }
}