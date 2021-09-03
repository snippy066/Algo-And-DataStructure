//package DS.queue;
//right view of a binary tree

/*
            1
          /   \
         2     3
        /     / \
        4     5  6
                 /
                 7


       right view =( 1,2,4,7);

 */
public class rightView {
    static class Node{
        int data;
        Node right,left;

        Node(int d){
            data=d;
            left=right=null;
        }
    }
    public static void main(String ar[]){
       Node root=new Node(1);
       root.left=new Node(2);
       root.right=new Node(3);
       root.left.left=new Node(4);
       root.right.left=new Node(5);
       root.right.right=new Node(6);
       root.right.right.left=new Node(7);
    }
}


