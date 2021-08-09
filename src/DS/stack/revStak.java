//package DS.stack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class revStak {
    public static void main(String ar[]){
        List<Integer> li= Arrays.asList();

        Stack<Integer> st=new Stack<>();
        st.addAll(li);

        System.out.println("original array: "+st);
        rev(st);
        System.out.println("reversed stack: "+st);
    }
    static void rev(Stack<Integer> st){
        if(st.isEmpty())
            return;

        int top=st.pop();

        rev(st);

        revInst(st,top);
    }

    static void revInst(Stack<Integer> st,int key){
        st.push(key);
    }
}
