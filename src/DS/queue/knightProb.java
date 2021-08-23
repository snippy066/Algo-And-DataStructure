//package DS.queue;
//knight's problem from going to one corner to another corner

public class knightProb {
    static int col[]={2,2,-2,-2,1,1,-1,-1};
    static int row[]={1,-1,1,-1,2,-2,2,-2};
    public static void main(String ar[]){
            node sour=new node(0,7);
            node dest=new node(7,0);


    }
    static class node{
        int dist;
        int x,y;
        node(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
}
