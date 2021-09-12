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
    }
}

class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}