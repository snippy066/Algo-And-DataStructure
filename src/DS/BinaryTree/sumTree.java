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
        root.right.left.right = new Node(8);

        convertToSumTree(root);
        inorder(root);
        System.out.println(sb.toString());
    }

    static int convertToSumTree(Node root){
        if(root==null)
            return 0;

        int left=convertToSumTree(root.left);
        int right=convertToSumTree(root.right);

        root.data+=left+right;

        return root.data;
    }

    static void inorder(Node root){
        if(root==null)
            return;

        inorder(root.left);
        sb.append(root.data+" ");
        inorder(root.right);

    }
}
