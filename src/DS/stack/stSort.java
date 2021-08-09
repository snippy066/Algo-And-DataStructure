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
}
