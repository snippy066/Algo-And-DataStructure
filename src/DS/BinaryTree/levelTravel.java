//package DS.BinaryTree;
//level order traversal of binary tree using recursion

public class levelTravel {

    static StringBuilder sb=new StringBuilder();

    static class Node{
        int data;
        Node left,right;

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

        Node root = new Node(15);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(8);
        root.left.right = new Node(12);
        root.right.left = new Node(16);
        root.right.right = new Node(25);

        levelOrderTraversal(root);

        System.out.println(sb.toString());
    }

    static void levelOrderTraversal(Node head){

        int level=1;

        while(printLevel(head,level)){
            level++;
        }

    }//end

    static boolean printLevel(Node root, int level){

        if(root==null)
            return false;

        if(level==1){
            sb.append(root.data+" ");
            return true;
        }

        boolean leftTree=printLevel(root.left, level-1);
        boolean rightTree=printLevel(root.right, level-1);

        return leftTree||rightTree;

    }//end of printLevel method
}
