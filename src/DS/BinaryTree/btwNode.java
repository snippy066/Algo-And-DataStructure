//package DS.BinaryTree;
//printing node of binary tree between given two levels

import DS.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class btwNode {
    public static void main(String ar[]){
        Node root = new Node(15);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(8);
        root.left.right = new Node(12);
        root.right.left = new Node(16);
        root.right.right = new Node(25);
        root.right.right.right = new Node(30);

        int start = 2, end = 3;
        btwNode b=new btwNode();
        b.printNodes(root, start, end);
    }

    void printNodes(Node root,int s,int e){
        HashMap<Integer, List<Integer>> hs=new HashMap<>();

        printNodes(root,1,hs);

        for(int i=s;i<=e;i++){
            System.out.println("level "+i+" : "+hs.get(i));
        }
    }

    void printNodes(Node root, int level,HashMap<Integer,List<Integer>> m){
        if(root==null)
            return;

        if(!m.containsKey(level))   m.put(level,new ArrayList<Integer>());

        m.get(level).add(root.data);

        printNodes(root.left,level+1,m);
        printNodes(root.right,level+1,m);
    }

}
