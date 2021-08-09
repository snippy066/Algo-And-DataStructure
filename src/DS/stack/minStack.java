//package DS.stack;
//returning minimum element of stack while maintaining it's complexity

import java.util.Stack;

public class minStack {
    public static void main(String ar[]){
        MinStack ms=new MinStack();
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

class MinStack{
    private Stack<Integer> st;
    private Stack<Integer> aux;
    MinStack(){

    }
    void push(int d){

    }
    int pop(){

    }
    int min(){

    }
    int size(){

    }
    int peek(){

    }
    boolean empty(){
        
    }
}