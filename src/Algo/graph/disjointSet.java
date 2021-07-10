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
            gr.edge[i].src = Integer.parseInt(s[i]);
            gr.edge[i].des = Integer.parseInt(s[i + 1]);
        }

        if (isCycle(gr) == true)
            System.out.println("graph contains cycle");
        else
            System.out.println("graph doesn't contain cycle");

    }


    static boolean isCycle(Graph graph){
        int[] parent=new int[graph.V];

        for(int i=0;i<parent.length;i++)   parent[i]=-1;

        for(int i=0;i< graph.E;i++){

            int x=find(parent,graph.edge[i].src);
            int y=find(parent,graph.edge[i].des);

            if(x==y)
                return true;
            uniGra(parent,x,y);

        }
        return false;
    }

    static int find(int[] parent ,int x){
        if(parent[x]==-1)
            return x;
        return find(parent,parent[x]);
    }

    static void uniGra(int[] parent,int x, int y){
        parent[x]=y;
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