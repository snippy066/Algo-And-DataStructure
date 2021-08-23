//package DS.queue;
//knight's problem from going to one corner to another corner

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;

public class knightProb {
    static StringBuilder sb=new StringBuilder();
    static int col[]={2,2,-2,-2,1,1,-1,-1};
    static int row[]={1,-1,1,-1,2,-2,2,-2};

    static class node{
        int dist,x,y;

        node(int x,int y){
            this.x=x;
            this.y=y;
        }

        node (int x,int y, int d){
            this.x=x;
            this.y=y;
            dist=d;
        }
    }

    public static void main(String ar[]){
            int N=8;   //chessboard size
            node sour=new node(0,7);
            node dest=new node(7,0);

            sb.append("No. of Steps required to reach destination : ");
            findSteps(sour,dest,N);

            System.out.println();
    }

    void findSteps(node s,node d,int size){
        HashSet<node> hs=new HashSet<>();

        Queue<node> q=new ArrayDeque<>();

        q.add(s);

        while(!q.isEmpty()){
            node newNode =q.poll();

            int x=newNode.x;
            int y=newNode.y;
            int dis=newNode.dist;

            
        }
    }

}
