//package DS.BinaryTree;
//priting vertical nodes of a binary tree

/* Construct the following tree
               1
             /   \
            /     \
           2       3
                 /   \
                /     \
               5       6
             /   \
            /     \
           7       8
                 /   \
                /     \
               9      10
       */

import DS.Node;

import java.util.*;

public class verticleNodes {
    public static void main(String ar[]){

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);
        root.right.left.right.left = new Node(9);
        root.right.left.right.right = new Node(10);

        printVertical(root);
    }

    static void printVertical(Node root){
        if(root==null)
            return;

        HashMap<Integer, List<Integer>> hs=new HashMap<>();

        printVertical(root,hs,0);

        for(Collection<Integer> c:hs.values()){
            System.out.println(c);
        }
    }

    static void printVertical(Node root,HashMap<Integer,List<Integer>> m,int dist){
        if(root==null)
            return;

        if(!m.containsKey(dist))    m.put(dist,new ArrayList<Integer>());

        m.get(dist).add(root.data);

        printVertical(root.left,m,dist-1);
        printVertical(root.right,m,dist+1);
    }

}

