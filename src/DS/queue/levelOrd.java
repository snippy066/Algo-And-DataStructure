//package DS.queue;
//level order traversal of binary tree using queue

import java.util.ArrayDeque;
import java.util.Queue;

public class levelOrd {

    static class Node{
        int data;
       Node left,right;

        Node(int d){
            data=d;
            left=right=null;
        }
    }

    public static void main(String ar[]){
    /*
         create a tree like
                    15
                 /      \
                10       20
              /    \    /    \
             8     12  16   25
       */

        Node root = new Node(15);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(8);
        root.left.right = new Node(12);
        root.right.left = new Node(16);
        root.right.right = new Node(25);

        levelOrderTraversal(root);
    }

    static void levelOrderTraversal(Node head){
        Queue<Node> q=new ArrayDeque<>();

        q.add(head);
        Node curr;

        while(!q.isEmpty()){
            curr=q.poll();

            sb.append(q.data);
            if(curr.left!=null) {
                q.add(curr.left);
            }
            if(curr.right!=null) {
                q.add(curr.right);
            }
        }

    }
}
