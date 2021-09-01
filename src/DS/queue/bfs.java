//package DS.queue;
//breadth first search using iterative method with help of queue

import java.util.Arrays;

public class bfs {

    class Edge{
        int src,dest;
        Edge(int s,int d){
            src=s;
            dest=d;
        }
    }
    public static void main(String ar[]){
        List<Edge> edges = Arrays.asList(
                new Edge(1, 2), new Edge(1, 3), new Edge(1, 4),
                new Edge(2, 5), new Edge(2, 6), new Edge(5, 9),
                new Edge(5, 10), new Edge(4, 7), new Edge(4, 8),
                new Edge(7, 11), new Edge(7, 12)
        );
    }
}
