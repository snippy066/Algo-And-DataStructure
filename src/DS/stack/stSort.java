//package DS.stack;


import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class stSort {
    public static void main(String ar[]){
        List<Integer> li= Arrays.asList(5, -2, 9, -7, 3);

        Stack<Integer> st=new Stack<>();
        st.addAll(li);

        System.out.println("Stack before sorting"+st);
        sortStack(st);
        System.out.println("Stack after sorting"+st);

    }

    static void sortStack(Stack<Integer> st){
        if(st.isEmpty())
            return;

        int top=st.pop();
        sortStack(st);

        sortIns(st,top);
    }

    static void sortIns(Stack<Integer> st, int key){
        if(st.isEmpty() || key>=st.peek()) {
            st.push(key);
            return;
        }

        int top=st.pop();

        sortIns(st,key);

        st.push(top);   //pushing the element back which were popped
    }
}
