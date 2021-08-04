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

        if(root==null || root.next==null)
            return root;

        Node midnode=getMid(root);
        Node nextOfmid=midnode.next;

        midnode.next=null;

        Node left=mergeSort(root);
        Node right=mergeSort(nextOfmid);

        Node sortlistNode=sortNode(left,right);

        return sortlistNode;
    }

    static  Node sortNode(Node a , Node b){
        Node result=null;

        if(a==null)
            return b;
        if(b==null)
            return a;

        if(a.data<b.data){
            result =a;
            result.next=sortNode(a.next,b);
        }
        else{
            result=b;
            result.next=sortNode(a,b.next);
        }

        return result;
        
    }

    static Node getMid(Node n){
        if(n==null)
            return n;
        Node slow_p=n, fast_p=n;

        while(slow_p!=null && fast_p!=null && fast_p.next!=null){
            slow_p=slow_p.next;
            fast_p=fast_p.next.next;
        }

        return slow_p;
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
