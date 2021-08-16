//package DS.stack;
//string replacement using stack iterative approach

import java.util.Stack;

public class StringReplace {
    public static void main(String ar[]){
        String str = "1?11?00?1?";

        printAllCombinations(str);
    }

    static void printAllCombinations(String str){
        Stack<String> st=new Stack<>();

        st.push(str);
        int index;

        while(!st.isEmpty()){
            String curr=st.pop();

            if((index=curr.indexOf('?'))!=-1){
                for(char ch='0'; ch<='1';ch++) {
                    curr = curr.substring(0, index) +
                }
            }
        }
    }
}
