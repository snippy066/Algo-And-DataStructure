//package DS.binarySearchTree;
//search key in a binary search tree



public class searchKey {

    static class Node{
        int data;
        Node left = null, right = null;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String ar[]){
        int[] keys = { 15, 10, 20, 8, 12, 16, 25 };

        Node root = null;
        for (int key: keys) {
            root = insert(root, key);
        }
        search(root,25,null);
    }
    public  static Node insert(Node root, int d){
        if(root==null) return new Node(d);
        if(d>root.data) insert(root.right,d);
        else
            insert(root.left,d);
        return root;
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
            else if(parent.data>d){
                System.out.println("value found at left tree of "+parent.data);
            }
            else{
                System.out.println("value found at right tree of "+parent.data);
            }
            return;
        }
        else if(root.data>d)
            search(root.left,d,root);
        else
            search(root.right,d,root);
    }
}
