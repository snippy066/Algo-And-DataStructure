//package DS.queue;
//shortest path in maze using BFS

import java.util.ArrayDeque;
import java.util.Queue;

public class mazeShortestPath {

    static int N=10;
    static int[] row={1,0,0,-1};
    static int[] col={0,-1,1,0};

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

        System.out.println("shortes path length : "+ans);
    }

    static int shortPath(int[][] maze,int i,int j,int x,int y){
        int min_dist=0;
        Queue<Node> q=new ArrayDeque<>();
        boolean[][] visited=new boolean[N][N];

        q.add(new Node(i,j,min_dist));
        visited[i][j]=true;

        while(!q.isEmpty()){
            Node newnode=q.poll();
            i=newnode.x;
            j=newnode.y;
            min_dist=newnode.dist;

            if(x==i && y==j)
                return min_dist;

            for(int k=0;k<4;k++){
                if(isValid(maze,visited,i+row[k],j+col[k])) {
                    visited[i+row[k]][j+col[k]]=true;
                    q.add(new Node(i + row[k], j + col[k], min_dist + 1));
                }
            }
        }

        return -1;
    }

    static boolean isValid(int[][] m,boolean [][] vi,int i,int j){
        return (i>= 0) && (i < N) && (j >= 0) && (j < N) && m[i][j] == 1 && !vi[i][j];
    }

}
