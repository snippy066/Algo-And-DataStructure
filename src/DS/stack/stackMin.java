//package DS.stack;

import java.util.Stack;

public class stackMin {
    public static void main(String ar[]){
        minele st=new minele();
        st.push(6);
        System.out.println(st.min());

        st.push(7);
        System.out.println(st.min());

        st.push(5);
        System.out.println(st.min());

        st.push(3);
        System.out.println(st.min());

        System.out.println(st.pop());
        System.out.println(st.min());

        System.out.println(st.pop());
        System.out.println(st.min());
    }
}

class minele{
    private Stack<Integer> st;
    private int m;

    minele(){
        st=new Stack<>();
    }
    void push(int data){
        if(empty()){
            st.push(data);
            m=data;
        }
        else if(data>m) st.push(data);

        else{
            st.push(2*data-m);
            m=data;
        }
    }
    int pop(){
        if(st.isEmpty()){
            System.out.println("uderflow");
            return -1;
        }
        int top=st.peek();

        if(top>m)   return top;

        int temp=m;
        m=2*m-top;
        return m;
    }
    int size(){
        return st.size();
    }
    boolean empty(){
        return st.isEmpty();
    }

    int min(){
        return m;
    }
}