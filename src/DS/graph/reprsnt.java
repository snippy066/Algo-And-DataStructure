package DS.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class reprsnt {
    void addEdge(List<List<Integer>> adj,int start,int dest){
        adj.get(start).add(dest);
        adj.get(dest).add(start);
    }
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt(); //number of vertex

        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<v;i++){
            graph.add(new ArrayList<Integer>());
        }

        reprsnt g=new reprsnt();
        //bidirection graph
        g.addEdge(graph, 0, 1);
        g.addEdge(graph, 0, 4);
        g.addEdge(graph, 1, 2);
        g.addEdge(graph, 1, 3);
        g.addEdge(graph, 1, 4);
        g.addEdge(graph, 2, 3);
        g.addEdge(graph, 3, 4);

        for(int i=0;i<v;i++){
            System.out.println("vertex "+i+" adjacency list "+graph.get(i));

        }
       // System.out.println(graph);
    }
}
