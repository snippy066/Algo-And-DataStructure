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

        System.out.println(li.testLoop(li.head));

    }
}

class linkedList{
    Node head;
    void push(int val){
    Node nextnode=new Node(val);
    nextnode.next=head;
    head=nextnode;
    }

    class Node{
        int data;
        Node next;

        Node(int d){
            data=d;
            next=null;
        }
    }

    boolean testLoop(Node root){
        if(root==null)
            return false;

        Node slow_p=root, fast_p=root;

        while(slow_p!=null && fast_p!=null  && fast_p.next!=null){
            slow_p=slow_p.next;
            fast_p=fast_p.next.next;

            if(slow_p==fast_p)
                return true;
        }
        return false;
    }
}
