//package DS.stack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class revStak {
    public static void main(String ar[]){
        List<Integer> li= Arrays.asList(1,2,3,4,5,6);

        Stack<Integer> st=new Stack<>();
        st.addAll(li);

        System.out.println("original stack: "+st);
        rev(st);
        System.out.println("reversed stack: "+st);
    }
    static void rev(Stack<Integer> st){
        if(st.isEmpty())
            return;

        int top=st.pop();

        rev(st);

        instAtBtm(st,top);
    }

    static void instAtBtm(Stack<Integer> st,int key){
        if(st.isEmpty()){
            st.push(key);
            return;
        }

        int top=st.pop();

        instAtBtm(st,key);
        st.push(top);
    }
}
