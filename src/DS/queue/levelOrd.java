//package DS.queue;
//level order traversal of binary tree using queue

public class levelOrd {
    
    static StringBuilder sb=new StringBuilder();

    static class Node{
        int data;
        levelTravel.Node left,right;

        Node(int d){
            data=d;
            left=right=null;
        }
    }

    public static void main(String ar[]){
    /*
         create a tree like
                    15
                 /      \
                10       20
              /    \    /    \
             8     12  16   25
       */

        levelTravel.Node root = new levelTravel.Node(15);
        root.left = new levelTravel.Node(10);
        root.right = new levelTravel.Node(20);
        root.left.left = new levelTravel.Node(8);
        root.left.right = new levelTravel.Node(12);
        root.right.left = new levelTravel.Node(16);
        root.right.right = new levelTravel.Node(25);

        levelOrderTraversal(root);

        System.out.println(sb.toString());
    }
}
