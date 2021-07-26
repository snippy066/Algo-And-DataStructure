package Algo.greedy;

import java.util.Scanner;

public class kruskalMST {
    public static void  main(String ar[]){
        Scanner in=new Scanner(System.in);

        int E=in.nextInt();
        int V=in.nextInt();

        Graph gr=new Graph(V,E);
    }
}
class Graph{
    int V,E;
    Edge ed[];
    Graph(int ver,int edg){
        V=ver;
        E=edg;

        ed=new Edge[E];

        for(int i=0;i<edg;i++)  ed[i]=new Edge();
    }

    class Edge implements Comparable<Edge> {
      int src,dest,weight;

        public int compareTo(Edge com){
            return this.weight-com.weight;
        }
    };
}
