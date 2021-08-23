//package DS.queue;
//shortest path in maze using BFS

import java.util.ArrayDeque;
import java.util.Queue;

public class mazeShortestPath {

    static int N=10;
    static int[] row={1,-1,0,0};
    static int[] col={0,0,1,-1};

    static class Node{
        int x,y,dist;
        Node(int x,int y, int dist){
            this.x=x;
            this.y=y;
            this.dist=dist;
        }
    }

    public static void main(String ar[]){
        //input maze
        int[][] mat =
                {
                        { 1, 1, 1, 1, 1, 0, 0, 1, 1, 1 },
                        { 0, 1, 1, 1, 1, 1, 0, 1, 0, 1 },
                        { 0, 0, 1, 0, 1, 1, 1, 0, 0, 1 },
                        { 1, 0, 1, 1, 1, 0, 1, 1, 0, 1 },
                        { 0, 0, 0, 1, 0, 0, 0, 1, 0, 1 },
                        { 1, 0, 1, 1, 1, 0, 0, 1, 1, 0 },
                        { 0, 0, 0, 0, 1, 0, 0, 1, 0, 1 },
                        { 0, 1, 1, 1, 1, 1, 1, 1, 0, 0 },
                        { 1, 1, 1, 1, 1, 0, 0, 1, 1, 1 },
                        { 0, 0, 1, 0, 0, 1, 1, 0, 0, 1 },
                };

        // Find the shortest path from source `(0, 0)` to destination `(7, 5)`
        int ans=shortPath(mat, 0, 0, 7, 5);
    }

    static int shortPath(int[][] maze,int i,int j,int x,int y){
        Queue<Node> q=new ArrayDeque<>();
        boolean[][] visited=new boolean[N][N];

        q.add(new Node(i,j,0));
        visited[i][j]=true;

        while(!q.isEmpty()){
            
        }

        return -1;
    }

}
