import java.util.ArrayDeque;
import java.util.Deque;
//import java.util.Queue;


class diagonalView
{
   static  class Node
    {
        int data;
        Node left = null, right = null;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args)
    {
        /* Construct the following tree
               1
             /   \
            /     \
          2        3
         /        /  \
        /        /    \
       4        5      6
               / \
             /    \
            7      8
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(8);
        root.left.left.right=new Node(9);
        root.left.right.left=new Node(10);
        root.right.right.left=new Node(14);
        root.right.right.right=new Node(15);

        diagonalPrint(root);
    }

    static void diagonalPrint(Node head){
       Deque<Node> dq=new ArrayDeque<>();
       dq.add(head);

       while(!dq.isEmpty()){
           Node node=dq.pollLast();

           if(node.right!=null)
               dq.addLast(node.right);
           if(node.left!=null)
               dq.addFirst(node.left);
           
       }

    }
}