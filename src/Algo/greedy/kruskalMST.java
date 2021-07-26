package Algo.greedy;

import java.util.Scanner;

public class kruskalMST {
    public static void  main(String ar[]){
        Scanner in=new Scanner(System.in);

        int E=in.nextInt();
        int V=in.nextInt();

        Graph gr=new Graph(V,E);

        /* graph
                 10
            0--------1
            |  \     |
           6|   5\   |15
            |      \ |
            2--------3
                4       */

        // add edge 0-1
        gr.ed[0].src = 0;
        gr.ed[0].dest = 1;
        gr.ed[0].weight = 10;

        // add edge 0-2
        gr.ed[1].src = 0;
        gr.ed[1].dest = 2;
        gr.ed[1].weight = 6;

        // add edge 0-3
        gr.ed[2].src = 0;
        gr.ed[2].dest = 3;
        gr.ed[2].weight = 5;

        // add edge 1-3
        gr.ed[3].src = 1;
        gr.ed[3].dest = 3;
        gr.ed[3].weight = 15;

        // add edge 2-3
        gr.ed[4].src = 2;
        gr.ed[4].dest = 3;
        gr.ed[4].weight = 4;


        gr.krusMst();
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


    static void krusMst(){

    }
}
