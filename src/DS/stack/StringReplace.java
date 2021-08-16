//package DS.stack;
//string replacement using stack iterative approach

import netscape.security.UserTarget;

import java.util.Stack;

public class StringReplace {
    static StringBuilder sb=new StringBuilder();
    public static void main(String ar[]){
        String str = "1?11?00?1?";

        printAllCombinations(str);
        System.out.println(sb.toString());
    }

    static void printAllCombinations(String str){
        Stack<String> st=new Stack<>();

        st.push(str);
        int index;

        while(!st.isEmpty()){
            String curr=st.pop();

            if((index=curr.indexOf('?'))!=-1){
                for(char ch='0'; ch<='1';ch++) {
                    curr = curr.substring(0, index) +ch+curr.substring(index+1);

                    st.push(curr);
                }
            }
            else{
                sb.append(curr+"\n");
            }
        }
    }
}
