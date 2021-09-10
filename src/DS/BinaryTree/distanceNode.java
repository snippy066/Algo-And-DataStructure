//package DS.BinaryTree;
//distance between two nodes in binary tree
 /*
              1
            /   \
           /     \
          2       3
           \     / \
            4   5   6
               /     \
              7       8

              assumption : each node has unique value , either both nodes are present or none

              distance of 7,8 : 4 ( 7->5->3(LCA)->6->8)
        */


public class distanceNode  {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
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
        root.right.right.right = new Node(8);

        // find the distance between node 7 and node 6
        System.out.print(findDistance(root, 7,6));
    }

    static int findDistance(Node root,int x,int y){
        if(root==null)
            return -1;
        Node lca;
        if(isNodePrsnt(root,x)||isNodePrsnt(root,y)){
            lca=findLca(root,x,y);
        }
        else return -2; //if lca not found

        return level(lca,x,0)+level(lca,y,0);

    }

    static int level(Node root,int val,int level){
        if(root==null)
            return -1;
        if(root.data==val)
            return level;

        int left=level(root.left,val,level+1);

        if(left!=-1) return left;

        return level(root.right,val,level+1);
    }

    static boolean isNodePrsnt(Node head,int val){
        if(head==null)
            return false;
        if(head.data==val)
            return true;

        return isNodePrsnt(head.left,val)||isNodePrsnt(head.right,val);
    }

    static Node findLca(Node root,int x,int y){
        if(root==null)
            return null;

        if(root.data==x || root.data==y)    return root;

        Node left=findLca(root.left,x,y);
        Node right=findLca(root.right,x,y);

        if(left!=null && right!=null) return root;

        if(left!=null)  return left;
        else return right;

    }
}
