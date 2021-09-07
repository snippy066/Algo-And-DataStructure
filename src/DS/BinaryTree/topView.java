//package DS.BinaryTree;
//top view of binary tree

import java.util.Map;
import java.util.TreeMap;

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

        static<U,V> Pair<U,V> Of(U x,V y){
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
        root.right.left.left.left = new Node(9);

        printTop(root);
    }

    static void printTop(Node root){
        Map<Integer,Pair<Integer,Integer>> m=new TreeMap<>();

        printTop(root,0,0,m);

        for(Pair<Integer,Integer> it : m.values()){
            System.out.print(it.firs+" ");
        }

    }

    static void printTop(Node head,int dist,int level,Map<Integer,Pair<Integer,Integer>> m){
        if(head==null)
            return;

        if(!m.containsKey(dist)||level<m.get(dist).second)
            m.put(dist,Pair.Of(head.data,level));

        printTop(head.left,dist-1,level+1,m);
        printTop(head.right,dist+1,level+1,m);
    }

}
