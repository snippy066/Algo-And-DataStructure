//package DS.queue;
//right view of a binary tree

import java.util.ArrayDeque;
import java.util.Queue;

/*
            1
          /   \
         2     3
        /     / \
        4     5  6
                 /
                 7


       right view =( 1,3,6,7);

 */
public class rightView {
    static int maxlevel=0;
    static StringBuilder sb=new StringBuilder();
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

       view(root,1);
       System.out.println(sb.toString());
    }

    static void view (Node head,int level){
        if(head==null)
            return;

       if(maxlevel<level){
           sb.append(head.data+" ");
           maxlevel=level;
       }

       view(head.right,level+1);
       view(head.left,level+1);

    }
}


