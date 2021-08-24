//package DS.queue;
//spiral order traversal of binary tree

/*
                    1
                 /      \
                2         3
              /   \     /    \
             4     5   6      7

        order : (1,2,3,7,6,5,4) or (1,3,2,4,5,6,7)
 */

public class spiralOrder {

    static class Node{
        int data;
        Node left, right;

        Node(int d){
            data=d;
            left=right=null;
        }
    }

    public static void main(String ar[]){
        Node root = new Node(15);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(8);
        root.left.right = new Node(12);
        root.right.left = new Node(16);
        root.right.right = new Node(25);

        spiralOrderTraversal(root);
    }
}
