//package DS.BinaryTree;
//sum of binary tree in place

/*
        1
       / \
      2   3
     /   / \
    4   5   6

    sum tree :

           20
         /    \
        6     14
       /    /   \
      0    0     0

      inorder : 0 6 20 0 14 0
 */
public class sumTree {
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

        convertToSumTree(root);
        inorder(root);
    }

    static int convertToSumTree(Node root){
        
    }
}
