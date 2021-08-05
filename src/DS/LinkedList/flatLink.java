//package DS.LinkedList;


public class flatLink {
    Node head;
    public static void main(String[] ar){

        flatLink list=new flatLink();

         /* creating following linked list
            5 -> 10 -> 19 -> 28
            |    |     |     |
            V    V     V     V
            7    20    22    35
            |          |     |
            V          V     V
            8          50    40
            |                |
            V                V
            30               45
        */

        list.head = list.push(list.head, 30);
        list.head = list.push(list.head, 8);
        list.head = list.push(list.head, 7);
        list.head = list.push(list.head, 5);

        list.head.next = list.push(list.head.next, 20);
        list.head.next = list.push(list.head.next, 10);

        list.head.next.next = list.push(list.head.next.next, 50);
        list.head.next.next = list.push(list.head.next.next, 22);
        list.head.next.next = list.push(list.head.next.next, 19);

        list.head.next.next.next = list.push(list.head.next.next.next, 45);
        list.head.next.next.next = list.push(list.head.next.next.next, 40);
        list.head.next.next.next = list.push(list.head.next.next.next, 35);
        list.head.next.next.next = list.push(list.head.next.next.next, 28);



    }

    Node push(Node root,int data){
        Node newnode =new Node(data);
        newnode.down=root;
        root=newnode;
        
        return root;
    }

    class Node{
        int data ;
        Node next,down;

        Node(int d){
            data=d;
            next=null;
            down=null;
        }
    }
}

