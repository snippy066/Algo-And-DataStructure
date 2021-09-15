//package DS.binarySearchTree;
//search key in a binary search tree

import DS.Node;

public class searchKey {
    public  static Node insert(Node root, int d){
        if(root==null) new Node(d);
        if(d>root.data) insert(root.right,d);
        else
            insert(root.left,d);
        return root;
    }
    public static void main(String ar[]){
        int[] keys = { 15, 10, 20, 8, 12, 16, 25 };

        Node root = null;
        for (int key: keys) {
            root = insert(root, key);
        }
        
    }
}
