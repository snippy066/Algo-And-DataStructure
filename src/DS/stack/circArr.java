//package DS.stack;
//finding next greater element in circular array

import java.util.Arrays;
import java.util.Stack;

public class circArr {
    public static void main(String ar[]){
        int[] arr = { 2, 7, 3, 5, 4, 6, 8 };

        int[] result = findNextG(arr);
        System.out.println(Arrays.toString(result));
    }

    static int[] findNextG(int[] arr) {
        int len = arr.length;
        int[] rs = new int[len];
        Arrays.fill(rs, -1);  //so that if greater element not found it returns -1

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < len; i++) {

            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                rs[st.pop()] = arr[i];
            }
            //current index
            st.push(i);

        }
    }
}
