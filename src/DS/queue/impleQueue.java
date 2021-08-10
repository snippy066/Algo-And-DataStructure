//package DS.queue;

public class impleQueue {
    public static void main(String ar[]){
       queue q = new queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);

        System.out.printf("The front element is %d\n", q.peek());

        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();

        if (q.isEmpty()) {
            System.out.print("The queue is empty");
        }
        else {
            System.out.print("The queue is not empty");
        }
    }
}

class queue{
    Node rear=null, front=null;

    void enqueue(int key){

    }

    int dequeue(){

        return -1;
    }

    boolean isEmpty(){

        return false;
    }

    int peek(){

        return 0;
    }

    class  Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
}
