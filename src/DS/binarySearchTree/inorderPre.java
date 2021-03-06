//package DS.binarySearchTree;
//inorder predecessor in a give binary tree

import DS.Node;

public class inorderPre {
    public static void main(String ar[]){


        /* Construct the following tree
                   15
                 /    \
                /      \
               10       20
              /  \     /  \
             /    \   /    \
            8     12 16    25
        */

        int[] keys = { 15, 10, 20, 8, 12, 16, 25 };

        Node root = null;
        for (int key: keys) {
            root = insert(root, key);
        }

        // find inorder predecessor for each key
        for (int key: keys) {
            Node prec = findPredecessor(root, null, key);

            if (prec != null) {
                System.out.println("The predecessor of node " + key + " is "
                        + prec.data);
            } else {
                System.out.println("The predecessor doesn't exist for node "
                        + key);
            }
        }
    }

    static Node insert(Node root,int key){
        if(root==null)
            return new Node(key);
        if(key<root.data)
            root.left=insert(root.left,key);
        else
            root.right=insert(root.right,key);

        return root;

    }
    static Node findPredecessor(Node root, Node prec,int key){
        if(root==null)
            return prec;

        if(root.data==key){
            if(root.left!=null)
                return findMax(root.left);
        }
        else if(key<root.data){
            return findPredecessor(root.left,prec,key);
        }
        else{
            prec=root;
            return findPredecessor(root.right,prec,key);
        }
        return  prec;
    }

    static Node findMax(Node head){
        while(head.right!=null)
            head=head.right;

        return head;
    }
}
