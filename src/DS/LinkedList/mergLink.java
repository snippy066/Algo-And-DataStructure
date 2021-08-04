//merge sort on a linked list
//package DS.LinkedList;

public class mergLink {
    private static StringBuilder sb=new StringBuilder();
    static Node head;
    public static void main(String ar[]){

        mergLink li=new mergLink();

        li.push(15);
        li.push(10);
        li.push(5);
        li.push(20);
        li.push(3);
        li.push(2);

        sb.append("linked list before sorting: ");
        while(head!=null) {
            sb.append(head.data+" ");
            head=head.next;
        }
        head=mergeSort(head);

        sb.append("\n linked list aftor sorting :");
        while(head!=null) {
            sb.append(head.data+" ");
            head=head.next;
        }

        System.out.println(sb.toString());
    }

    static Node mergeSort(Node root){


        return root;
    }

    static void push(int data){
        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;
    }

    static class Node{
        int data;
        Node next;

        Node(int d){
            data=d;
            next=null;
        }
    }
}
