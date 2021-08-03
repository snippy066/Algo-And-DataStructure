//loop detection in singly linked by floyd's cycle finding algo
package DS.LinkedList;


public class loopDete {
    public static void main(String ar[]){
        linkedList li=new linkedList();

        li.push(10);
        li.push(20);
        li.push(30);
        li.push(40);

        li.head.next.next.next.next=li.head;        //created loop for testing

        testLoop();
    }

    static void testLoop(){

    }
}

class linkedList{
    Node head;
    static void push(int val){

    }

    class Node{
        int data;
        Node next;

        Node(int d){
            data=d;
            next=null;
        }
    }

}
