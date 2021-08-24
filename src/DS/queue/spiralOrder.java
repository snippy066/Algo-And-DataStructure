//package DS.queue;
//spiral order traversal of binary tree

/*
                    1
                 /      \
                2         3
              /   \     /    \
             4     5   6      7

        order : (1,2,3,7,6,5,4) or (1,3,2,4,5,6,7)
 */

import java.util.ArrayDeque;
import java.util.Deque;
//import java.util.Queue;

public class spiralOrder {

    static StringBuilder sb=new StringBuilder();

    static class Node{
        int data;
        Node left, right;

        Node(int d){
            data=d;
            left=right=null;
        }
    }

    public static void main(String ar[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(8);
        root.right.right.right = new Node(9);

        spiralOrderTraversal(root);
    }

    static void spiralOrderTraversal(Node root){
        Deque<Node> q=new ArrayDeque<>();

        q.add(root);
        boolean flag=false;
        while(!q.isEmpty()){
            int size=q.size();

            //left to right
            if(flag){
                while(size-->0){
                    Node node=q.pollFirst();
                    sb.append(node.data+" ");

                    if(node.left!=null)
                        q.addLast(node.left);
                    if(node.right!=null)
                        q.addLast(node.right);
                }
            }
            //right to left
            else{
                while(size-->0) {
                    Node node = q.pollLast();
                    sb.append(node.data + " ");
                    
                    if (node.right != null)
                        q.addFirst(node.right);
                    if (node.left != null)
                        q.addFirst(node.left);

                }
            }
            flag=!flag;
            sb.append("\n");
        }

    }
}
