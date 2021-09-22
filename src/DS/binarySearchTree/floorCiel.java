import DS.Node;

import java.util.Scanner;

//package DS.binarySearchTree;
//finding floor and ceil value in binary tree
public class floorCiel {
    static Node insert(Node root,int key){
        if(root==null)
            return new Node(key);

        if(key<root.data){
            root.left=insert(root.left,key);
        }
        else
            root.right=insert(root.right,key);

        return root;
    }
    public static void main(String ar[]){
        //Scanner sc=new Scanner(System.in);
        int[] keys = { 2, 4, 6, 8, 9, 10, 12 };

        Node root = null;
        for (int key: keys) {
            root = insert(root, key);
        }

        // find the ceil and floor for each key
        for (int i = 0; i < 15; i++)
        {
            FloorCeil ob = new FloorCeil();

            findFloorCeil(root, ob, i);
            System.out.println(i + " —> Floor is " + ob.getFloorData()
                    + ", Ceil is " + ob.getCeilData());
        }
    }

    static void findFloorCeil(Node head,FloorCeil obj,int key){
        while(head!=null){
            if(head.data==key){
                obj.setCeil(head);
                obj.setFloor(head);
                break;
            }
            else if(key<head.data){
                obj.setCeil(head);
                head=head.left;
            }
            else{
                head=head.right;
                obj.setFloor(head);
            }
        }
    }
}

class FloorCeil{
    private Node floor,ceil;

    FloorCeil(){
        floor=new Node(-1);
        ceil=new Node(-1);

    }

    public void setCeil(Node ceil) {
        this.ceil = ceil;
    }

    public void setFloor(Node floor) {
        this.floor = floor;
    }

    public int getCeilData() {
        return ceil.data;
    }

    public int getFloorData() {
        return floor.data;
    }
}
