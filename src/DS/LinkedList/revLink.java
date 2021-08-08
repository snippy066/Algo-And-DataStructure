//package DS.LinkedList;

import java.util.Scanner;

public class revLink {
     static Node head;
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while(t-- > 0)
            {
                int n = sc.nextInt();
                int a1 = sc.nextInt();
                node head = new node(a1);
                node tail = head;
                for(int i = 1; i < n; i++)
                {
                    int a = sc.nextInt();
                    // addToTheLast(new Node(a));
                    tail.next = new node(a);
                    tail =tail.next;
                }

                int k = sc.nextInt();
                rvrs rv = new rvrs();
                node res = rv.reverse(head, k);
                printList(res);
                System.out.println();
            }
        }

        public static void printList(node root)
        {
            while(root != null)
            {
                System.out.print(root.data + " ");
                root = root.next;
            }
        }
}


    class rvrs
    {
        public static node reverse(node root, int k)
        {
            node prev=null,next=null,current=node;
            if(root==null||root.next==null)
                return root;
            int count=0;
            while(count<k&&current!=null){
                next=current.next;
                current.next=prev;
                prev=current;
                current=next;
                count++;
            }
            if(next!=null)
                root.next=reverse(next,k);
            return prev;
        }
    }
class node
{
    int data;
    node next;
    node(int key)
    {
        data = key;
        next = null;
    }
}
