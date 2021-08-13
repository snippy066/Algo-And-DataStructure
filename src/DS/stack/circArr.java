//package DS.stack;
//finding next greater element in circular array

/*
Input:  [3, 5, 2, 4]
Output: [5, -1, 4, 5]

Input:  [7, 5, 3, 4]
Output: [-1, 7, 4, 7]
 */

import java.util.Arrays;
import java.util.Stack;

public class circArr {
    public static void main(String ar[]){
        int[] arr = { 3, 5, 2, 4 };

        int[] result = findNextG(arr);
        System.out.println(Arrays.toString(result));
    }

    static int[] findNextG(int[] arr) {
        int len = arr.length;
        int[] rs = new int[len];
        Arrays.fill(rs, -1);  //so that if greater element not found it returns -1

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < 2*len; i++) {

            while (!st.isEmpty() && arr[st.peek()] < arr[i%len]) {
                rs[st.pop()] = arr[i%len];
            }
            //current index
            st.push(i%len);

        }
        return  rs;
    }
}
