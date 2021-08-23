//package DS.queue;
//reverse traversing of the binary tree;


import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class reversTraver {
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

        revBin(root);
        System.out.println("reverse of the binary tree is : "+ sb.toString());
    }

    static void revBin(Node root){
        Queue<Node> q=new ArrayDeque<>();
        Stack<Integer> st=new Stack<>();

        q.add(root);

        while(!q.isEmpty()){
            int size=q.size();

            while(size-->0){
                Node node=q.poll();

                if(node.left!=null)
                    q.add(node.left);
                if(node.right!=null)
                    q.add(node.right);

                st.push(node.data);
            }
        }

        while (!st.isEmpty())   sb.append(st.pop()+" ");
    }
}
