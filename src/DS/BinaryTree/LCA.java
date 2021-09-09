//package DS.BinaryTree;
//lowest commmon ancestor of a binary tree assuming that either both nodes are present or none
/*
              1
            /   \
           /     \
          2       3
           \     / \
            4   5   6
               / \
              7   8
        */

public class LCA {
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
        root.left.right = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.right.right = new Node(8);

        Node temp=findLCA(root,4,5);
        sb.append(temp.data+" ");
        temp=findLCA(root,3,6);
        sb.append(temp.data+" ");
        
    }

    static Node findLCA(Node root,int x,int y){
        if(root==null)
            return null;

        if(root.data==x || root.data==y) return root;

        Node left=findLCA(root.left,x,y);
        Node right=findLCA(root.right,x,y);

        if((left!=null)&& (right!=null)) return root;

        if(left!=null) return left;

        else return right;

    }
}
