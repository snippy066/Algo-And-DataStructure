//package DS.BinaryTree;
//top view of binary tree

import java.util.Map;

public class topView {
    static class Node{
        int data;
        Node left,right;
        Node(int d){
            data=d;
            left=right=null;
        }
    }

    static class Pair<U,V>{
        U firs;
        V second;

        Pair(U firs,V second){
            this.firs=firs;
            this.second=second;
        }

        Pair<U,V> of(U x,V y){
            return new Pair<>(x,y);
        }
        
    }

    public static void main(String ar[]){
        Node root=new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);

        printTop(root);
    }

    static void printTop(Node root){
        Map<Integer,Pair<Integer,Integer>> m=new Map<Integer, Pair<Integer, Integer>>();

    }

}
