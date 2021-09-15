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
        search(root,25,null);
    }
    static void search(Node root,int d,Node parent){
        if(root==null){
            System.out.println("value not found in the tree");
            return;
        }
        if(root.data==d){
            if(parent==null){
                System.out.println("value found at root" +d);
            }
            if(parent.data>d){
                System.out.println("value found at left tree of "+parent.data);
            }
            else{
                System.out.println("value found at right tree of "+parent.data);
            }
            return;
        }
        else if(root.data>d) search(root.left,d,root);
        else
            search(root.right,d,root);
    }
}
