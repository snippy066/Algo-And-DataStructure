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
        Node newnode=new Node(key);

        if(front==null){
            front=newnode;
            rear=newnode;
        }
        else{
            rear.next=newnode;
            rear=newnode;
        }
        System.out.println("inserting data :" +key);
    }

    int dequeue(){

        if(front==null){
            rear=null;
            System.out.println("Uderflow");
            return -1;
        }

        System.out.println("dequeuing data : "+front.data);
        int temp=front.data;

        front=front.next;
        return temp;
    }

    boolean isEmpty(){

        return rear==null && front==null;
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
