//implementation using queue
//package DS.stack;

import java.util.ArrayDeque;
import java.util.Queue;

public class implimentation {
    public static void main(String ar[]){

        int[] element={1,2,5,4,3,5,8};

        stack<Integer> st=new stack<Integer>();

        for(Integer key:element) st.add(key);

        for(int i=0;i<element.length;i++)   System.out.print(st.poll()+" ");
    }
}

class stack<t>{
    Queue<t> q1,q2;

    stack(){
        q1=new ArrayDeque<>();
        q2=new ArrayDeque<>();
    }

    void add(t data){
        while(!q1.isEmpty())
            q2.add(q1.poll());

        q1.add(data);

        while(!q2.isEmpty())
            q1.add(q2.poll());
    }

    t poll(){
        if(q1.isEmpty()){
            System.out.println("Uderflow");
            System.exit(0);
        }

        t val=q1.poll();

        return val;
    }
}
