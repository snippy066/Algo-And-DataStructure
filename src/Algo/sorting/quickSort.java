//package Algo.sorting;
// quick sort iterative approach using stack

import java.util.Arrays;
import java.util.Stack;

public class quickSort {
    public static void main(String ar[]){
        int a[] = { 9, -3, 5, 2, 6, 8, -6, 1, 3 };

        iterativeQuicksort(a);

        // print the sorted array
        System.out.println(Arrays.toString(a));
    }

    static void iterativeQuicksort(int[] arr){
        Stack<Pair> st=new Stack<>();

        int start=0;
        int end=arr.length-1;

        st.push(new Pair(start,end));

        while(!st.isEmpty()){
            start=st.peek().getX();
            end=st.peek().getY();

            st.pop();

            int pivot=partition(arr,start,end);

            if(pivot-1>start)   st.push(new Pair(start,pivot-1));

            if(pivot+1<end)     st.push(new Pair(pivot+1,end));
        }
    }

    static int partition(int[] arr,int st, int end){
        int pivot=arr[end];

        int pInd=st;

        for(int i=st;i<end;i++ ){

            if(arr[i]<=pivot){
                swap(arr,i,pInd);
                pInd++;
            }
        }
        swap(arr,pInd,end);

        return pInd;
    }
    static void swap(int[] a,int i, int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}

class Pair{
    int x,y;
    Pair(int x,int y){
        this.x=x;
        this.y=y;
    }
    int getX(){
        return x;
    }
    int getY(){
        return y;
    }
}
