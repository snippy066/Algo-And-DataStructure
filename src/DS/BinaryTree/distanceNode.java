//package DS.BinaryTree;
//distance between two nodes in binary tree
 /*
              1
            /   \
           /     \
          2       3
           \     / \
            4   5   6
               /     \
              7       8

              assumption : each node has unique value , either both nodes are present or none

              distance of 7,8 : 4 ( 7->5->3(LCA)->6->8)
        */

import DS.BinaryTree.Node;
public class distanceNode {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
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
        root.right.right.right = new Node(8);

        // find the distance between node 7 and node 6
        System.out.print(findDistance(root, 7,6));
    }

    static int findDistance(Node root,int x,int y){
        return -1;
    }
}
