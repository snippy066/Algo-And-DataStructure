//package DS.queue;
//breadth first search using iterative method with help of queue

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class bfs {

    public static void main(String ar[]){
        List<Edge> edges = Arrays.asList(
                new Edge(1, 2), new Edge(1, 3), new Edge(1, 4),
                new Edge(2, 5), new Edge(2, 6), new Edge(5, 9),
                new Edge(5, 10), new Edge(4, 7), new Edge(4, 8),
                new Edge(7, 11), new Edge(7, 12)
        );

        int n=15;   //number of nodes

        Graph g=new Graph(edges,n);


    }
}
class Edge{
    int src,dest;
    public Edge(int s,int d){
        src=s;
        dest=d;
    }
}

class Graph{
    List<List<Integer>>  adj=null;
    Graph(List<Edge> edges, int N){

        adj=new ArrayList<>();

        for(int i=0;i<N;i++){
            adj.add(new ArrayList<Integer>());
        }

        for(Edge ed:edges){
            int sr=ed.src;
            int de=ed.dest;

            adj.get(sr).add(de);
            adj.get(de).add(sr);
        }
    }

}
