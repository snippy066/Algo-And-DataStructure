//package DS.LinkedList;

import java.util.*;
import java.io.*;

public class delteMid{
        static void printList(Node node)
        {
            while (node != null)
            {
                System.out.print(node.data + " ");
                node = node.next;
            }
            System.out.println();
        }
        public static void main(String args[]) throws IOException {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t > 0){
                int n = sc.nextInt();
                Node head = new Node(sc.nextInt());
                Node tail = head;
                for(int i=0; i<n-1; i++)
                {
                    tail.next = new Node(sc.nextInt());
                    tail = tail.next;
                }
                Solution g = new Solution();
                head = g.deleteMid(head);
                printList(head);
                t--;
            }
        }
    }
public class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }

}
    class Solution {
        Node deleteMid(Node head) {
            Node slow_p=head,fast_p=head;
            Node temp=head;
            while(slow_p!=null && (fast_p!=null) && fast_p.next!=null){
                temp=slow_p;
                slow_p=slow_p.next;
                fast_p=fast_p.next.next;
            }
            //Node temp=slow_p;
            //System.out.println(temp.data);
            temp.next=temp.next.next;
            slow_p.next=null;

            return head;
        }
    }

