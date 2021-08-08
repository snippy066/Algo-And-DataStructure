//implementation using queue
//package DS.stack;

import java.util.ArrayDeque;
import java.util.Queue;

public class implimentation {
    public static void main(String ar[]){

        int[] element={1,2,5,4,3,5,8};

        stack<Integer> st=new stack<Integer>();

        for(Integer key:element) st.add(key);

        for(int i=0;i<element.length;i++)   System.out.println(st.poll());
    }
}

class stack<t>{
    Queue<t> q1,q2;

    stack(){
        q1=new ArrayDeque<>();
        q2=new ArrayDeque<>();
    }
    
}
