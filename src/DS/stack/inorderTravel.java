//package DS.stack;
//iterative and recursive approach

import java.util.Stack;

public class inorderTravel {
    static StringBuilder sb=new StringBuilder();

    //node class to construct tree
    static class Node{
        int data;
        Node right,left;
        Node(int d){
            data=d;
            right=left=null;
        }
    }// end of node class

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

        System.out.println(sb.toString());
    }

//recursive approach
    static void recursiveInord(Node head){
        if(head==null)
            return;

        recursiveInord(head.left);

        sb.append(head.data+" ");

        recursiveInord(head.right);
    }

//iterative approach
    static void iterativeInord(Node head){
        sb.append("\n");
        Stack<Node> st=new Stack<>();

        Node curr=head;

        while(!st.isEmpty() || curr!=null){
            if(curr!=null){
                st.push(curr);
                curr=curr.left;
            }
            else{
                Node tem=st.pop();
                sb.append(tem.data+" ");
                curr=tem.right;
            }

        }//end of while

    } //end of iterative method

}// end of class
