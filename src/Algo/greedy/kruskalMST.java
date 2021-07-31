package Algo.greedy;

import java.util.Arrays;
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


    void krusMst(){
        Edge result[] =new Edge[V];

        for(int i=0;i<V;i++)    result[i]=new Edge();

        Arrays.sort(ed);

        Subset sb[] =new Subset[V];

        for(int i=0;i<V;i++)    sb[i]=new Subset();

        for(int i=0;i<V;i++){
            sb[i].parent=-1;
            sb[i].rank=0;
        }

        int i=0,e=0;

        while(e<V-1){
            Edge next=ed[i];
            int x=find(sb,next.src);
            int y=find(sb,next.dest);

            if(x!=y){
                result[e]=next;
                union(sb,x,y);
                e++;
            }
            i++;
        }
        int minimumCost = 0;
        for (i = 0; i < e; ++i)
        {
            System.out.println(result[i].src + " -- "
                    + result[i].dest
                    + " == " + result[i].weight);
            minimumCost += result[i].weight;
        }
        System.out.println("Minimum Cost Spanning Tree "
                + minimumCost);

    }

    int find(Subset[] sb, int i){

        if(sb[i].parent==-1)
            return i;

        return find(sb,sb[i].parent);
    }

    void union(Subset[] sb, int x, int y){
        int rootx=find(sb,x);
        int rooty=find(sb,y);

        if(sb[rootx].rank < sb[rooty].rank) sb[rootx].parent=rooty;
        else if(sb[rootx].rank > sb[rooty].rank)    sb[rooty].parent=rootx;
        else{
            sb[rooty].parent=rootx;
            sb[rootx].rank++;
        }
    }


    class Subset{
        int parent,rank;
    }
}
