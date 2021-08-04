//printing middle element of linked list
//package DS.LinkedList;

import java.util.Scanner;

public class midEle {
    public static void main(String[] ar){

        Scanner in=new Scanner(System.in);

        linkedList li=new linkedList();

        int n=in.nextInt();
        for(int i=0;i<n;i++)    li.push(in.nextInt());

        int val=printMid(li,li.head);
    }

    static int printMid(linkedList list,linkedList.Node root){
        if(root==null)
            return -1;
        linkedList.Node slow_p=root,fast_p=root;

        while(slow_p!=null && fast_p!=null && fast_p.next!=null)   {
            slow_p=slow_p.next;
            fast_p=fast_p.next.next;
        }
        return  slow_p.data;
    }
}

class linkedList{
    public Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }

    void push(int data){
        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;
    }
}
