//left view of binary tree using queue iterative approach
//package DS.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class leftViewIter {
    static StringBuilder sb=new StringBuilder();
    static class Node{
        int data;
        Node left,right;
        Node(int d){
            data=d;
            left=right=null;
        }
    }
    public static void main(String ar[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);

        leftView(root);
        System.out.println(sb.toString());
    }
    static void leftView(Node head){
        Queue<Node> q=new ArrayDeque<>();

        q.add(head);

        while(!q.isEmpty()){
            int size=q.size();
            int i=0;

            while(i++<size){
                Node node=q.poll();
                if(i==1)
                    sb.append(node.data+" ");

                if(node.left!=null)
                    q.add(node.left);
                if(node.right!=null)
                    q.add(node.right);
            }
        }
    }
}
