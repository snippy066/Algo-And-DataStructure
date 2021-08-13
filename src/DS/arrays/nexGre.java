//package DS.arrays;
//finding next greater element in array

import java.util.Arrays;

/*
Input:  [2, 7, 3, 5, 4, 6, 8]
Output: [7, 8, 5, 6, 6, 8, -1]

Input:  [5, 4, 3, 2, 1]
Output: [-1, -1, -1, -1, -1] //no greater element found next

 */
public class nexGre {
    public static void main(String ar[]){
        int[] arr = { 2, 7, 3, 5, 4, 6, 8 };

        int[] result = findNextG(arr);
        System.out.println(Arrays.toString(result));
    }
}
