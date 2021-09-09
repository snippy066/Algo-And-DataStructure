//package DS.BinaryTree;
//getting diameter of binary tree

public class diameterBinaryTree {
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
        root.right.left.right = new Node(8);

        System.out.println(diamtere(root,0));
    }
    static int diamtere(Node root,int i){
        if(root==null)
            return 0;

        int left_h=diamtere(root.left,i+1);
        int right_h=diamtere(root.right,i+1);

        int max_di=left_h+right_h+1;


        return Math.max(left_h,right_h)+1;
    }
}
