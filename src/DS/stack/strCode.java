//package DS.stack;

import java.util.Stack;

public class strCode {
    public static void main(String ar[]){
        // input sequence
        String st = "IDIDII";

        System.out.println("The minimum number is " + decode(st));
    }
    static String decode(String s){
     String result="";
     Stack<Integer> st=new Stack<>();

     for(int i=0;i<s.length();i++){
         st.push(i+1);

         if(s.charAt(i)=='I'){
             while(!st.isEmpty()) result+=st.pop()+"";
         }
     }
        while(!st.isEmpty()) result+=st.pop()+"";
     return result;
    }
}
