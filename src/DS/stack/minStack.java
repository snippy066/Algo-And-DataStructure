//package DS.stack;
//returning minimum element of stack while maintaining it's complexity

import com.sun.javaws.jnl.LaunchSelection;

import java.util.Stack;

public class minStack {
    public static void main(String ar[]){
        minimumStack ms=new minimumStack();
        ms.push(6);
        System.out.println(ms.min());    // prints 6

        ms.push(7);
        System.out.println(ms.min());    // prints 6

        ms.push(8);
        System.out.println(ms.min());    // prints 6

        ms.push(5);
        System.out.println(ms.min());    // prints 5

        ms.push(3);
        System.out.println(ms.min());    // prints 3

        ms.pop();
        System.out.println(ms.min());    // prints 5

        ms.push(10);
        System.out.println(ms.min());    // prints 5

        ms.pop();
        System.out.println(ms.min());    // prints 5

        ms.pop();
        System.out.println(ms.min());    // prints 6
    }
}

class minimumStack {
    private Stack<Integer> st;
    private Stack<Integer> aux;
    minimumStack(){
        st=new Stack<>();
        aux=new Stack<>();
    }
    void push(int d){
        st.push(d);
        if(aux.empty() || (aux.peek()>=d))
            aux.push(d);
    }
    int pop(){
        if(st.isEmpty()){
            System.out.println("Uderflow");
            return -1;
        }
        int tp=st.pop();

        if(aux.peek()==tp)  aux.pop();

        return tp;
    }
    int min(){

        if(aux.isEmpty()){
            System.out.println("Underflow");
            return -1;
        }

        return aux.peek();
    }
    int size(){
        return st.size();
    }
    int peek(){
        return  st.size();
    }
    public boolean empty(){
        return st.isEmpty();
    }
}