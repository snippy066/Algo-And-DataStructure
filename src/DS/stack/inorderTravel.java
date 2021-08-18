//package DS.stack;
//iterative and recursive approach

public class inorderTravel {
    //node class to construct tree
    static class Node{
        int data;
        Node right,left;
        Node(int d){
            data=d;
            right=left=null;
        }
    }

    public static void main(String ar[]){
         /* Construct the following tree
                   1
                 /   \
                /     \
               2       3
              /      /   \
             /      /     \
            4      5       6
                  / \
                 /   \
                7     8
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);

        recursiveInord(root);
        iterativeInord(root);

    }

//recursive approach
    static void recursiveInord(Node head){

    }

//iterative approach
    static void iterativeInord(Node head){

    }

}
