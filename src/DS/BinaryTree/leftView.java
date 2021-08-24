//package DS.BinaryTree;
//left view of binary tree;


public class leftView {
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
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);

        leftView(root,1);
    }

    static void leftView(Node head,int level){
        int maxLevel=0;

        if(maxLevel<level){
            sb.append(head.data);
            maxLevel=level;
        }
        leftView(head.left,level+1);
        leftView(head.right,level+1);
    }
}
