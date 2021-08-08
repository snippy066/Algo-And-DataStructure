//removing element from a sorted linked list
//package DS.LinkedList;

import java.util.HashMap;

public class remDupli {
    public static void main (String[] args)
    {
        Node head = null;

		/* Created linked list will be
		11->11->11->13->13->20 */
        head = push(head, 20);
        head = push(head, 13);
        head = push(head, 13);
        head = push(head, 11);
        head = push(head, 11);
        head = push(head, 11);
        System.out.print("Linked list before duplicate removal ");
        printList(head);
        System.out.print("\nLinked list after duplicate removal ");
        removeDuplicates(head);
    }

        static Node push(Node head_ref, int new_data)
        {

            Node new_node = new Node();

            new_node.data = new_data;

            new_node.next = (head_ref);

            head_ref = new_node;
            return head_ref;
        }

        static void printList(Node node)
        {
            while (node != null)
            {
                System.out.print(node.data + " ");
                node = node.next;
            }
        }

        // Function to remove duplicates
        static void removeDuplicates(Node head)
        {
            HashMap<Integer, Boolean> track = new HashMap<>();
            Node temp = head;

            while(temp != null)
            {
                if(!track.containsKey(temp.data))
                {
                    System.out.print(temp.data + " ");
                }
                track.put(temp.data , true);
                temp = temp.next;
            }
        }
    static class Node{
        int data;
        Node next;
        Node() {
            data = 0;
            next = null;
        }
    }

}
