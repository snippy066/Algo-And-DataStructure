package DS.LinkedList;


import java.util.Scanner;

//searching element in singly linked list
//pushing element in reverse order ex
/*
10 ,20 ,30 ,40
head->40->30->20->10
 */
public class loop {
    Node head;
    public static void main(String ar[]){

        loop li=new loop();

        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        for(int i=0;i<n;i++)   li.push(in.nextInt());

        int key=in.nextInt();   //element to be searched

        System.out.println(search(li.head,key));

    }

   void push(int ele){
        Node ne=new Node(ele);
        ne.next=head;
        head=ne;

    }

    static boolean search(Node head,int key){

        if(head==null)
            return false;

        if(head.data==key)
            return true;

        return search(head.next,key);
    }
}

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

