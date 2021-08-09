package DS.stack;

import java.util.Stack;

public class dupliPra {
    public static void main(String ar[]){
        String exp = "((x+y))";        // assumes valid expression

        if (duplicateParenthesis(exp)) {
            System.out.println("The expression has duplicate parenthesis.");
        }
        else {
            System.out.println("The expression does not have duplicate parenthesis");
        }
    }
    static boolean duplicateParenthesis(String ex){
        Stack<Character> st=new Stack<>();

        for(Character c:ex.toCharArray()){
            if(c!=')')  st.push(c);

            else{
                int flag=0;
                if(st.peek()=='(') return true;

                while(st.peek()!='(' && !st.isEmpty())
                    st.pop();

                if(st.pop()=='(')
                    return true;
            }
        }//end of for loop

        return false;
    }
}
