//package DS.queue;
//height of binary tree using queue

import java.util.ArrayDeque;
import java.util.Queue;

public class heightOfbin {

    static class Node{
        int data;
        Node left, right;
        Node(int d){
            data=d;
            left=right=null;
        }
    }
    public static void main(String ar[]){
        Node root = new Node(15);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(8);
        root.left.right = new Node(12);
        root.right.left = new Node(16);
        root.right.right = new Node(25);

        System.out.print("The height of the binary tree is " + height(root));
    }

    static int height(Node root){

        Queue<Node> q=new ArrayDeque<>();

        q.add(root);

        while(!q.isEmpty()){
            Node node=q.poll();

            int size=q.size();

            while(size-->0){
                if(node.left!=null)
                    q.add(node.left);
                if(node.right!=null)
                    q.add(node.right);
            }
        }
    }
}
